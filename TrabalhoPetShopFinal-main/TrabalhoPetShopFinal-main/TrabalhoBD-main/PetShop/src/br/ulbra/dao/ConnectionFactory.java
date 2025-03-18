
package br.ulbra.dao;




    import java.sql.Connection ;
    import java.sql.DriverManager ;
    import java.sql.PreparedStatement ;
    import java.sql.ResultSet ;
    import java.sql.SQLException ;
    import java.util.logging.Level ;
    import java.util.logging.Logger ;
    import javax.swing.JOptionPane ;

    public class ConnectionFactory {

        private static final String DRIVER = "com.mysql.jdbc.Driver"; //Driver JDBC
        private static final String URL = "jdbc:mysql://localhost:3306/petshop";// Url do banco de dados
        private static final String USER = "root"; //Login e senha do banco de dados
        private static final String PASS = "";

        public static Connection getConnection() throws SQLException {
            try {
                Class.forName(DRIVER);
                return DriverManager.getConnection(URL, USER, PASS);
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
                return null;
            }
        }

        public static void closeConnection(Connection con) {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }

        public static void closeConnection(Connection con, PreparedStatement stmt) {
            closeConnection(con);
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }

        public static void closeConnection(Connection con, PreparedStatement stmt,
                ResultSet rs) {

            closeConnection(con, stmt);

            try {

                if (rs != null) {
                    rs.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    

  

    public class Usuario {

        private int idUsu;
        private String nomeUsu;
        private String emailUsu;
        private String senhaUsu;
        private String foneUsu;
        private int sexoUsu;

        public Usuario() {
        }

        public Usuario(int idUsu, String nomeUsu, String emailUsu,
                String senhaUsu, String foneUsu, int sexoUsu) {
            this.idUsu = idUsu;
            this.nomeUsu = nomeUsu;
            this.emailUsu = emailUsu;
            this.senhaUsu = senhaUsu;
            this.foneUsu = foneUsu;
            this.sexoUsu = sexoUsu;
        }

        public String toString() {
            return " ID:    " + this.idUsu
                    + " Nome:  " + this.nomeUsu
                    + " E-mail:" + this.emailUsu
                    + " Senha: " + this.senhaUsu
                    + " Fone:  " + this.foneUsu
                    + " Sexo:  " + this.sexoUsu;
        }

        public int getIdUsu() {
            return idUsu;
        }

        public void setIdUsu(int idUsu) {
            this.idUsu = idUsu;
        }

        public String getNomeUsu() {
            return nomeUsu;
        }

        public void setNomeUsu(String nomeUsu) {
            this.nomeUsu = nomeUsu;
        }

        public String getEmailUsu() {
            return emailUsu;
        }

        public void setEmailUsu(String emailUsu) {
            this.emailUsu = emailUsu;
        }

        public String getSenhaUsu() {
            return senhaUsu;
        }

        public void setSenhaUsu(String senhaUsu) {
            this.senhaUsu = senhaUsu;
        }

        public String getFoneUsu() {
            return foneUsu;
        }

        public void setFoneUsu(String foneUsu) {
            this.foneUsu = foneUsu;
        }

        public int getSexoUsu() {
            return sexoUsu;
        }

        public void setSexoUsu(int sexoUsu) {
            this.sexoUsu = sexoUsu;
        }
    }

}
