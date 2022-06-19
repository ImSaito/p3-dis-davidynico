package practica2.practica2.Backend;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;



public class LectorJson {

  public static List<Equipo> leerEquipos() {

    try {
      // create a reader
      Reader reader = Files.newBufferedReader(Paths.get("equipos.json"));

      // convert JSON array to list of users
      List<Equipo> equipos = new Gson().fromJson(reader, new TypeToken<List<Equipo>>() {
      }.getType());

      // Mostrar registros leidos
      equipos.forEach(System.out::println);

      // close reader
      reader.close();

      return equipos;

    } catch (Exception ex) {
      return null;
    }
  }

  public static List<Prestamo> leerPrestamos() {

    try {
      // create a reader
      Reader reader = Files.newBufferedReader(Paths.get("prestamos.json"));

      // convert JSON array to list of users
      List<Prestamo> prestamos = new Gson().fromJson(reader, new TypeToken<List<Prestamo>>() {
      }.getType());

      // Mostrar registros leidos
      prestamos.forEach(System.out::println);

      // close reader
      reader.close();

      return prestamos;

    } catch (Exception ex) {
      return null;
    }
  }

  public static List<Usuario> leerUsuarios() {

    try {
      // create a reader
      Reader reader = Files.newBufferedReader(Paths.get("usuarios.json"));

      // convert JSON array to list of users
      List<Usuario> usuarios = new Gson().fromJson(reader, new TypeToken<List<Usuario>>() {
      }.getType());

      // Mostrar registros leidos
      usuarios.forEach(System.out::println);

      // close reader
      reader.close();

      return usuarios;

    } catch (Exception ex) {
      return null;
    }
  }

  public static List<String> getOnlyIdUsr() {

    try {
      // create a reader
      Reader reader = Files.newBufferedReader(Paths.get("prestamos.json"));

      List<String> ListaId = new ArrayList<String>();
      // convert JSON array to list of users
      List<Prestamo> prestamos = new Gson().fromJson(reader, new TypeToken<List<Prestamo>>() {
      }.getType());

      // close reader
      reader.close();

      for (Prestamo prestamo_aux : prestamos) {
        ListaId.add(prestamo_aux.getIdUsuario());
      }

      return ListaId;

    } catch (Exception ex) {
      return null;
    }

  }

  public static List<String> getOnlyIdEqui() {
    try {
      // create a reader
      Reader reader = Files.newBufferedReader(Paths.get("prestamos.json"));

      List<String> ListaId = new ArrayList<String>();
      // convert JSON array to list of users
      List<Prestamo> prestamos = new Gson().fromJson(reader, new TypeToken<List<Prestamo>>() {
      }.getType());

      // close reader
      reader.close();

      for (Prestamo prestamo_aux : prestamos) {
        ListaId.add(prestamo_aux.IdStr());
      }

      return ListaId;

    } catch (Exception ex) {
      return null;
    }
  }

  public static int SumarEquipo() {
    try {
      // create a reader
      Reader reader = Files.newBufferedReader(Paths.get("prestamos.json"));

      
      // convert JSON array to list of users
      List<Prestamo> prestamos = new Gson().fromJson(reader, new TypeToken<List<Prestamo>>() {
      }.getType());

      // close reader
      reader.close();

      int longi = prestamos.size()-1;
      int ret = prestamos.get(longi).getIdEquipo();

      return ret;

    } catch (Exception ex) {
      return 0;
    }
    

  }

}
