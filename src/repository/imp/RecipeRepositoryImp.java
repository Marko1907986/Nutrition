package repository.imp;

import domain.*;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.sql.*;
import javax.swing.JTextArea;
import connection.MyConnection;
import repository.RecipeRepository;

/**
 *
 * @author Marko Milosevic
 */
public class RecipeRepositoryImp implements RecipeRepository {

    @Override
    public List<Recipe> getBeverages() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE typeOfDish = 1";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> getSoups() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE typeOfDish = 2";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> getSauces() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE typeOfDish = 3";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> getEggDishes() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE typeOfDish = 4";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> getFishDishes() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE typeOfDish = 5";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> getMeatDishesFromTheGrill() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE typeOfDish = 6";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> getMeatDishesAndMeatProducts() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE typeOfDish = 7";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> findMeatDishesAndMeatProductsByQuery(String model) throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE NAME RLIKE '" + model + "' AND typeOfDish = 7";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> getVegetableDishes() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE typeOfDish = 8";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> findVegetableDishesByQuery(String model) throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE NAME RLIKE '" + model + "' AND typeOfDish = 8";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> getComplexDishes() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE typeOfDish = 9";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> findComplexDishesByQuery(String model) throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE NAME RLIKE '" + model + "' AND typeOfDish = 9";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> getSalads() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE typeOfDish = 10";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> getSweets() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE typeOfDish = 11";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> findSweetsByQuery(String model) throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE NAME RLIKE '" + model + "' AND typeOfDish = 11";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    @Override
    public List<Recipe> getReadyMeals() throws Exception {
        List<Recipe> recipes = new ArrayList<>();
        Connection connection = MyConnection.getInstance().getConnection();
        String query = "SELECT * FROM recipe WHERE typeOfDish = 12";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        addItem(resultSet, recipes);
        resultSet.close();
        statement.close();
        return recipes;
    }

    private void addItem(ResultSet resultSet, List<Recipe> recipes) {
        try {
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String typeOfDish = resultSet.getString("typeOfDish");
                String name = resultSet.getString("name");
                String energyValue = resultSet.getString("energyValueKJ(Cal)");
                BigDecimal protein = resultSet.getBigDecimal("protein");
                BigDecimal fats = resultSet.getBigDecimal("fats");
                BigDecimal carbohydrates = resultSet.getBigDecimal("carbohydrates");
                BigDecimal calcium = resultSet.getBigDecimal("calcium");
                BigDecimal iron = resultSet.getBigDecimal("iron");
                BigDecimal vitA = resultSet.getBigDecimal("vitaminA");
                BigDecimal vitB1 = resultSet.getBigDecimal("vitaminB1");
                BigDecimal vitB2 = resultSet.getBigDecimal("vitaminB2");
                BigDecimal niacin = resultSet.getBigDecimal("niacin");
                BigDecimal vitC = resultSet.getBigDecimal("vitaminC");
                Recipe recipe = new Recipe(id, TypeOfDish.valueOf(typeOfDish), name, energyValue, protein, fats,
                        carbohydrates, calcium, iron, vitA, vitB1, vitB2, niacin, vitC);
                recipes.add(recipe);
            }
        } catch (SQLException ex) {
        }
    }

    @Override
    public void readFile(JTextArea text, String name) {
        switch (name) {
            case "Caj pravi" -> {
                try ( FileReader fr
                        = new FileReader("caj_pravi.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Caj narodni" -> {
                try ( FileReader fr
                        = new FileReader("caj_narodni.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Caj sipkov" -> {
                try ( FileReader fr
                        = new FileReader("caj_sipkov.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Caj lipov" -> {
                try ( FileReader fr
                        = new FileReader("caj_lipov.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Caj od kamilice" -> {
                try ( FileReader fr
                        = new FileReader("caj_od_kamilice.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Caj serbet" -> {
                try ( FileReader fr
                        = new FileReader("caj_serbet.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Crna kafa" -> {
                try ( FileReader fr
                        = new FileReader("crna_kafa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Crna kafa - surogat" -> {
                try ( FileReader fr
                        = new FileReader("crna_kafa_surogat.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Bela kafa" -> {
                try ( FileReader fr
                        = new FileReader("bela_kafa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Bela kafa sa dvopekom" -> {
                try ( FileReader fr
                        = new FileReader("bela_kafa_sa_dvopekom.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Karamel - kafa" -> {
                try ( FileReader fr
                        = new FileReader("karamel_kafa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Cokoladno mleko" -> {
                try ( FileReader fr
                        = new FileReader("cokoladno_mleko.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kakao sa mlekom" -> {
                try ( FileReader fr
                        = new FileReader("kakao_sa_mlekom.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kakao mleko od instanta" -> {
                try ( FileReader fr
                        = new FileReader("kakao_mleko_od_instanta.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kiselo mleko" -> {
                try ( FileReader fr
                        = new FileReader("kiselo_mleko.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Jogurt" -> {
                try ( FileReader fr
                        = new FileReader("jogurt.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Limunada" -> {
                try ( FileReader fr
                        = new FileReader("limunada.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Knedle od griza psenicnog" -> {
                try ( FileReader fr
                        = new FileReader("knedle_od_griza_psenicnog.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Knedle od brasna psenicnog" -> {
                try ( FileReader fr
                        = new FileReader("knedle_od_brasna_psenicnog.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Knedle od instant kukuruznog brasna" -> {
                try ( FileReader fr
                        = new FileReader("knedle_od_instant_kukuruznog_brasna.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Knedle od krompira" -> {
                try ( FileReader fr
                        = new FileReader("knedle_od_krompira.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Knedle od dzigerice (jetre) sa mascu" -> {
                try ( FileReader fr
                        = new FileReader("knedle_od_dzigerice.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Knedle od dzigerice (jetre) sa margarinom" -> {
                try ( FileReader fr
                        = new FileReader("knedle_od_jetre.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Noklice - Kapanci" -> {
                try ( FileReader fr
                        = new FileReader("noklice.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Suseni hleb" -> {
                try ( FileReader fr
                        = new FileReader("suseni_hleb.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Govedja supa od kostiju" -> {
                try ( FileReader fr
                        = new FileReader("govedja_supa_od_kostiju.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pileca supa" -> {
                try ( FileReader fr
                        = new FileReader("pileca_supa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Supa od koncentrata" -> {
                try ( FileReader fr
                        = new FileReader("supa_od_koncentrata.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Supa od govedjeg repa (koncentrat)" -> {
                try ( FileReader fr
                        = new FileReader("supa_od_govedjeg_repa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Proletnja supa (koncentrat)" -> {
                try ( FileReader fr
                        = new FileReader("proletnja_supa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Francuska supa (koncentrat)" -> {
                try ( FileReader fr
                        = new FileReader("francuska_supa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Becka supa sa jetrenim okruglicama (koncentrat)" -> {
                try ( FileReader fr
                        = new FileReader("becka_supa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Minestrone supa (koncentrat)" -> {
                try ( FileReader fr
                        = new FileReader("minestrone_supa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Praska supa od krompira (koncentrat)" -> {
                try ( FileReader fr
                        = new FileReader("praska_supa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Paradajz corba" -> {
                try ( FileReader fr
                        = new FileReader("paradajz_corba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Corba od krompira (mast)" -> {
                try ( FileReader fr
                        = new FileReader("corba_od_krompira.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Corba od krompira (ulje)" -> {
                try ( FileReader fr
                        = new FileReader("corba_krompir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Corba od graska" -> {
                try ( FileReader fr
                        = new FileReader("corba_od_graska.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Corba od povrca" -> {
                try ( FileReader fr
                        = new FileReader("corba_od_povrca.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kisela corba" -> {
                try ( FileReader fr
                        = new FileReader("kisela_corba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Corba od kiselog kupusa" -> {
                try ( FileReader fr
                        = new FileReader("corba_od_kiselog_kupusa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Minestron corba" -> {
                try ( FileReader fr
                        = new FileReader("minestron_corba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Corba od pasulja pasirana" -> {
                try ( FileReader fr
                        = new FileReader("corba_od_pasulja.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krem corba od mrkve" -> {
                try ( FileReader fr
                        = new FileReader("corba_od_mrkve.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krem corba od spanaca" -> {
                try ( FileReader fr
                        = new FileReader("corba_od_spanaca.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krem corba od karfiola" -> {
                try ( FileReader fr
                        = new FileReader("corba_od_karfiola.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krem corba od tikvica" -> {
                try ( FileReader fr
                        = new FileReader("corba_od_tikvica.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krem corba od kelja" -> {
                try ( FileReader fr
                        = new FileReader("corba_od_kelja.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krem corba od pecuraka" -> {
                try ( FileReader fr
                        = new FileReader("corba_od_pecuraka.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Ragu corba od zivinskog mesa" -> {
                try ( FileReader fr
                        = new FileReader("ragu_corba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pileca corba (begova) sa uljem" -> {
                try ( FileReader fr
                        = new FileReader("pileca_corba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pileca corba (begova) sa maslacem" -> {
                try ( FileReader fr
                        = new FileReader("begova_corba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Jagnjeca corba kisela" -> {
                try ( FileReader fr
                        = new FileReader("jagnjeca_corba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Ruski borsc" -> {
                try ( FileReader fr
                        = new FileReader("borsc.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Gulas corba (madjarska)" -> {
                try ( FileReader fr
                        = new FileReader("gulas_corba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Corba kisela od iznutrica" -> {
                try ( FileReader fr
                        = new FileReader("corba_od_iznutrica.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Riblja corba" -> {
                try ( FileReader fr
                        = new FileReader("riblja_corba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sos jaki mrki (demi-glace)" -> {
                try ( FileReader fr
                        = new FileReader("sos_mrki.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Besamel sos" -> {
                try ( FileReader fr
                        = new FileReader("besamel_sos.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Morne (mornay) sos" -> {
                try ( FileReader fr
                        = new FileReader("morne_sos.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Paradajz sos" -> {
                try ( FileReader fr
                        = new FileReader("paradajz_sos.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sos od crnog luka" -> {
                try ( FileReader fr
                        = new FileReader("sos_crni_luk.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sos od belog luka" -> {
                try ( FileReader fr
                        = new FileReader("sos_beli_luk.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sos od mirodjije" -> {
                try ( FileReader fr
                        = new FileReader("sos_mirodjija.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sos od kiselog povrca" -> {
                try ( FileReader fr
                        = new FileReader("sos_kiselo_povrce.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Vinegret sos" -> {
                try ( FileReader fr
                        = new FileReader("vinegret_sos.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Majonez sos (fond)" -> {
                try ( FileReader fr
                        = new FileReader("majonez_sos.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Tartar sos" -> {
                try ( FileReader fr
                        = new FileReader("tartar_sos.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kuvana jaja u ljusci" -> {
                try ( FileReader fr
                        = new FileReader("kuvana_jaja.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Przena jaja \"na oko\"" -> {
                try ( FileReader fr
                        = new FileReader("przena_jaja.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Przena jaja sa sunkom" -> {
                try ( FileReader fr
                        = new FileReader("jaja_sunka.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Przena jaja sa kobasicom" -> {
                try ( FileReader fr
                        = new FileReader("jaja_kobasica.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Przena jaja sa slaninom" -> {
                try ( FileReader fr
                        = new FileReader("jaja_slanina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kajgana" -> {
                try ( FileReader fr
                        = new FileReader("kajgana.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kajgana sa jetrenom pastetom" -> {
                try ( FileReader fr
                        = new FileReader("kajgana_pasteta.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Omlet sa sirom" -> {
                try ( FileReader fr
                        = new FileReader("omlet_sir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Omlet sa suvim svinjskim mesom" -> {
                try ( FileReader fr
                        = new FileReader("omlet_sunka.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Omlet sa mesnim doruckom" -> {
                try ( FileReader fr
                        = new FileReader("omlet_konzerve.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Jaja punjena \"kasino\" masom" -> {
                try ( FileReader fr
                        = new FileReader("jaja_kasino.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Przeni hleb sa jajima (przenice)" -> {
                try ( FileReader fr
                        = new FileReader("przenice.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kuvana riba - leso" -> {
                try ( FileReader fr
                        = new FileReader("kuvana_riba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Riblji paprikas" -> {
                try ( FileReader fr
                        = new FileReader("riblji_paprikas.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Brodeto" -> {
                try ( FileReader fr
                        = new FileReader("brodeto.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Cufte od ribe" -> {
                try ( FileReader fr
                        = new FileReader("riblje_cufte.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Fasirana snicla od ribe" -> {
                try ( FileReader fr
                        = new FileReader("riblja_snicla.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pecena riba ucelo" -> {
                try ( FileReader fr
                        = new FileReader("pecena_riba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pecena riba u crnom luku" -> {
                try ( FileReader fr
                        = new FileReader("riba_luk.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Spikovana riba" -> {
                try ( FileReader fr
                        = new FileReader("spikovana_riba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pecena riba na zaru" -> {
                try ( FileReader fr
                        = new FileReader("riba_na_zaru.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Przena riba" -> {
                try ( FileReader fr
                        = new FileReader("przena_riba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pohovana riba" -> {
                try ( FileReader fr
                        = new FileReader("pohovana_riba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pohovani riblji file \"Orly\"" -> {
                try ( FileReader fr
                        = new FileReader("riblji_file.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Przena lignja" -> {
                try ( FileReader fr
                        = new FileReader("przena_lignja.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Punjene lignje" -> {
                try ( FileReader fr
                        = new FileReader("punjene_lignje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Cevapcici" -> {
                try ( FileReader fr
                        = new FileReader("cevapcici.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pljeskavica" -> {
                try ( FileReader fr
                        = new FileReader("pljeskavica.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Culbastija" -> {
                try ( FileReader fr
                        = new FileReader("culbastija.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Raznjici od teletine" -> {
                try ( FileReader fr
                        = new FileReader("raznjici_teletina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Raznjici od svinjetine" -> {
                try ( FileReader fr
                        = new FileReader("raznjici_svinjetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krmenadla na zaru" -> {
                try ( FileReader fr
                        = new FileReader("krmenadla.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Piletina na zaru" -> {
                try ( FileReader fr
                        = new FileReader("piletina_na_zaru.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dzigerica na zaru juneca" -> {
                try ( FileReader fr
                        = new FileReader("juneca_dzigerica_na_zaru.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dzigerica na zaru teleca" -> {
                try ( FileReader fr
                        = new FileReader("teleca_dzigerica_na_zaru.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dzigerica na zaru jagnjeca" -> {
                try ( FileReader fr
                        = new FileReader("jagnjeca_dzigerica_na_zaru.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kuvana govedina" -> {
                try ( FileReader fr
                        = new FileReader("kuvana_govedina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Govedja pecenica u natur-saftu" -> {
                try ( FileReader fr
                        = new FileReader("govedja_pecenica.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneca przola (dinstana)" -> {
                try ( FileReader fr
                        = new FileReader("juneca_przola.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dinstana govedina" -> {
                try ( FileReader fr
                        = new FileReader("dinstana_govedina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dinstani govedji odrezak" -> {
                try ( FileReader fr
                        = new FileReader("govedji_odrezak.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci odrezak Debrecin" -> {
                try ( FileReader fr
                        = new FileReader("debrecin.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci odrezak \"E Sterhazen\"" -> {
                try ( FileReader fr
                        = new FileReader("starhazen.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci odrezak Imperijal" -> {
                try ( FileReader fr
                        = new FileReader("imperijal.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci odrezak Portugez" -> {
                try ( FileReader fr
                        = new FileReader("portugez.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci misici u sosu od belog vina" -> {
                try ( FileReader fr
                        = new FileReader("juneci_misici.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Govedina u lovackom sosu" -> {
                try ( FileReader fr
                        = new FileReader("govedina_u_sosu.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Govedji gulas" -> {
                try ( FileReader fr
                        = new FileReader("gulas.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Cufte" -> {
                try ( FileReader fr
                        = new FileReader("cufte.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Fasirana snicla" -> {
                try ( FileReader fr
                        = new FileReader("fasirana_snicla.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Spikovana junetina" -> {
                try ( FileReader fr
                        = new FileReader("spikovana_junetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dalmatinska pasticada" -> {
                try ( FileReader fr
                        = new FileReader("pasticada.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci sote \"Stroganov\"" -> {
                try ( FileReader fr
                        = new FileReader("stroganov.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci perkelt" -> {
                try ( FileReader fr
                        = new FileReader("juneci_perkelt.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Teleci perkelt" -> {
                try ( FileReader fr
                        = new FileReader("teleci_perkelt.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dinstana jagnjetina" -> {
                try ( FileReader fr
                        = new FileReader("dinstana_jagnjetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Peceno jagnje na raznju" -> {
                try ( FileReader fr
                        = new FileReader("peceno_jagnje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Peceno prase na raznju" -> {
                try ( FileReader fr
                        = new FileReader("peceno_prase.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Natur snicla govedja" -> {
                try ( FileReader fr
                        = new FileReader("natur_govedja.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Natur snicla juneca" -> {
                try ( FileReader fr
                        = new FileReader("natur_juneca.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Natur snicla teleca" -> {
                try ( FileReader fr
                        = new FileReader("natur_teleca.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Natur snicla svinjska" -> {
                try ( FileReader fr
                        = new FileReader("natur_svinjska.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Svinjska krmenadla u belom luku (Triestino)" -> {
                try ( FileReader fr
                        = new FileReader("triestino.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pariska snicla teleca" -> {
                try ( FileReader fr
                        = new FileReader("pariska_teleca.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pariska snicla svinjska" -> {
                try ( FileReader fr
                        = new FileReader("pariska_svinjska.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Becka snicla teleca" -> {
                try ( FileReader fr
                        = new FileReader("becka_teleca.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Becka snicla svinjska" -> {
                try ( FileReader fr
                        = new FileReader("becka_svinjska.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sotirana piletina u natur-saftu" -> {
                try ( FileReader fr
                        = new FileReader("piletina_natur.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sotirana piletina u paradajz sosu" -> {
                try ( FileReader fr
                        = new FileReader("sotirana_piletina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pohovana piletina na \"becki\" nacin" -> {
                try ( FileReader fr
                        = new FileReader("piletina_becka.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pohovana piletina na \"pariski\" nacin" -> {
                try ( FileReader fr
                        = new FileReader("piletina_pariska.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci umokac" -> {
                try ( FileReader fr
                        = new FileReader("juneci_umokac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Teleci umokac" -> {
                try ( FileReader fr
                        = new FileReader("teleci_umokac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Jagnjeci umokac" -> {
                try ( FileReader fr
                        = new FileReader("jagnjeci_umokac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pileci umokac" -> {
                try ( FileReader fr
                        = new FileReader("pileci_umokac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Teleci paprikas" -> {
                try ( FileReader fr
                        = new FileReader("teleci_paprikas.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Svinjski paprikas" -> {
                try ( FileReader fr
                        = new FileReader("svinjski_paprikas.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Jagnjeci paprikas" -> {
                try ( FileReader fr
                        = new FileReader("jagnjeci_paprikas.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pileci paprikas" -> {
                try ( FileReader fr
                        = new FileReader("pileci_paprikas.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pecenje telece u plehovima" -> {
                try ( FileReader fr
                        = new FileReader("telece_pleh.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pecenje svinjsko u plehovima" -> {
                try ( FileReader fr
                        = new FileReader("svinjsko_pleh.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pecenje jagnjece u plehovima" -> {
                try ( FileReader fr
                        = new FileReader("jagnjece_pleh.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pecenje pilece u plehovima" -> {
                try ( FileReader fr
                        = new FileReader("pilece_pleh.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci jezik sa paradajz sosom" -> {
                try ( FileReader fr
                        = new FileReader("juneci_jezik.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Restovana dzigerica govedja-juneca" -> {
                try ( FileReader fr
                        = new FileReader("restovana_jetra_govedja.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Restovana dzigerica svinjska" -> {
                try ( FileReader fr
                        = new FileReader("restovana_jetra_svinjska.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Restovana dzigerica jagnjeca" -> {
                try ( FileReader fr
                        = new FileReader("restovana_jetra_jagnjeca.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Restovano srce" -> {
                try ( FileReader fr
                        = new FileReader("restovano_srce.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Skembici" -> {
                try ( FileReader fr
                        = new FileReader("skembici.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kuvane virsle - hrenovke" -> {
                try ( FileReader fr
                        = new FileReader("virsle.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kuvane kranjske kobasice" -> {
                try ( FileReader fr
                        = new FileReader("kranjske.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Barena suva slanina" -> {
                try ( FileReader fr
                        = new FileReader("barena_slanina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kuvano suvo svinjsko meso" -> {
                try ( FileReader fr
                        = new FileReader("kuvano_svinjsko.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Przene sirove kobasice" -> {
                try ( FileReader fr
                        = new FileReader("sirove_kobasice.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Gulas od mesnih konzervi" -> {
                try ( FileReader fr
                        = new FileReader("gulas_konzerve.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Paprikas od mesnih konzervi" -> {
                try ( FileReader fr
                        = new FileReader("paprikas_konzerve.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Boranija na ulju" -> {
                try ( FileReader fr
                        = new FileReader("boranija_ulje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dinstana boranija" -> {
                try ( FileReader fr
                        = new FileReader("dinstana_boranija.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dinstani grasak sa margarinom" -> {
                try ( FileReader fr
                        = new FileReader("dinstani_grasak.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dinstani grasak sa uljem" -> {
                try ( FileReader fr
                        = new FileReader("dinstani_grasak_ulje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Bareni karfiol" -> {
                try ( FileReader fr
                        = new FileReader("bareni_karfiol.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pohovani karfiol" -> {
                try ( FileReader fr
                        = new FileReader("pohovani_karfiol.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Bareni kelj" -> {
                try ( FileReader fr
                        = new FileReader("bareni_kelj.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dinstana keleraba" -> {
                try ( FileReader fr
                        = new FileReader("dinstana_keleraba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dinstani slatki kupus" -> {
                try ( FileReader fr
                        = new FileReader("dinstani_slatki_kupus.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dinstani kiseli kupus" -> {
                try ( FileReader fr
                        = new FileReader("dinstani_kiseli_kupus.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Podvarak bez mesa" -> {
                try ( FileReader fr
                        = new FileReader("podvarak.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dinstana mrkva" -> {
                try ( FileReader fr
                        = new FileReader("dinstana_mrkva.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pire od mrkve" -> {
                try ( FileReader fr
                        = new FileReader("pire_mrkva.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Spanac na ulju" -> {
                try ( FileReader fr
                        = new FileReader("spanac_ulje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pire od spanaca" -> {
                try ( FileReader fr
                        = new FileReader("pire_spanac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Varivo od tikvica" -> {
                try ( FileReader fr
                        = new FileReader("varivo_tikvice.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pire od blitve" -> {
                try ( FileReader fr
                        = new FileReader("pire_blitva.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Blitva na dalmatinski nacin" -> {
                try ( FileReader fr
                        = new FileReader("blitva_dalmacija.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Boranija sa krompirom" -> {
                try ( FileReader fr
                        = new FileReader("boranija_krompir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Fino varivo" -> {
                try ( FileReader fr
                        = new FileReader("fino_varivo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krompir sa keljom" -> {
                try ( FileReader fr
                        = new FileReader("krompir_kelj.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krompir sa prazilukom" -> {
                try ( FileReader fr
                        = new FileReader("krompir_praziluk.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krompir sa spanacem ili zeljem" -> {
                try ( FileReader fr
                        = new FileReader("krompir_spanac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Slani krompir" -> {
                try ( FileReader fr
                        = new FileReader("slani_krompir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Stosovani krompir" -> {
                try ( FileReader fr
                        = new FileReader("stosovani.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Restovani krompir" -> {
                try ( FileReader fr
                        = new FileReader("restovani.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pire od krompira sa mascu-uljem" -> {
                try ( FileReader fr
                        = new FileReader("pire_mast.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pire od krompira sa margarinom" -> {
                try ( FileReader fr
                        = new FileReader("pire_margarin.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pire od krompirovih pahuljica" -> {
                try ( FileReader fr
                        = new FileReader("pire_pahuljice.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Przeni krompir" -> {
                try ( FileReader fr
                        = new FileReader("przeni_krompir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Peceni krompir" -> {
                try ( FileReader fr
                        = new FileReader("peceni_krompir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pekarski krompir" -> {
                try ( FileReader fr
                        = new FileReader("pekarski_krompir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krompir paprikas" -> {
                try ( FileReader fr
                        = new FileReader("krompir_paprikas.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Valjusci od krompira" -> {
                try ( FileReader fr
                        = new FileReader("valjusci.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sataras sa jajima" -> {
                try ( FileReader fr
                        = new FileReader("sataras.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Djuvec od svezeg povrca" -> {
                try ( FileReader fr
                        = new FileReader("djuvec.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Djuvec od konzervisanog povrca" -> {
                try ( FileReader fr
                        = new FileReader("djuvec_konzerva.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Socivo sa krompirom" -> {
                try ( FileReader fr
                        = new FileReader("socivo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kuvano socivo" -> {
                try ( FileReader fr
                        = new FileReader("kuvano_socivo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pire od suvog graska" -> {
                try ( FileReader fr
                        = new FileReader("pire_grasak.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pire od pasulja" -> {
                try ( FileReader fr
                        = new FileReader("pire_pasulj.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Corbast pasulj" -> {
                try ( FileReader fr
                        = new FileReader("corbast_pasulj.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pasulj prebranac" -> {
                try ( FileReader fr
                        = new FileReader("prebranac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dinstani slatki kupus sa testeninom" -> {
                try ( FileReader fr
                        = new FileReader("kupus_testenina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Domaci rezanci" -> {
                try ( FileReader fr
                        = new FileReader("rezanci.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Mlinci" -> {
                try ( FileReader fr
                        = new FileReader("mlinci.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Noklice" -> {
                try ( FileReader fr
                        = new FileReader("kapanci.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kacamak (palenta) sa mascu ili uljem" -> {
                try ( FileReader fr
                        = new FileReader("kacamak.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kacamak (palenta) sa margarinom" -> {
                try ( FileReader fr
                        = new FileReader("palenta.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kuvana testenina" -> {
                try ( FileReader fr
                        = new FileReader("kuvana_testenina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rizi-bizi" -> {
                try ( FileReader fr
                        = new FileReader("rizi_bizi.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Dinstani pirinac" -> {
                try ( FileReader fr
                        = new FileReader("dinstani_pirinac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pilav" -> {
                try ( FileReader fr
                        = new FileReader("pilav.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Knedle od hleba" -> {
                try ( FileReader fr
                        = new FileReader("knedle_hleb.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci sote u boraniji" -> {
                try ( FileReader fr
                        = new FileReader("juneci_sote_boranija.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Teleci sote u boraniji" -> {
                try ( FileReader fr
                        = new FileReader("teleci_sote_boranija.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Jagnjeci sote u boraniji" -> {
                try ( FileReader fr
                        = new FileReader("jagnjeci_sote_boranija.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci sote u grasku" -> {
                try ( FileReader fr
                        = new FileReader("juneci_sote_grasak.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Teleci sote u grasku" -> {
                try ( FileReader fr
                        = new FileReader("teleci_sote_grasak.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Jagnjeci sote u grasku" -> {
                try ( FileReader fr
                        = new FileReader("jagnjeci_sote_grasak.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Govedji sote u mesanom povrcu" -> {
                try ( FileReader fr
                        = new FileReader("govedji_sote_povrce.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci sote u mesanom povrcu" -> {
                try ( FileReader fr
                        = new FileReader("juneci_sote_povrce.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Teleci sote u mesanom povrcu" -> {
                try ( FileReader fr
                        = new FileReader("teleci_sote_povrce.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Jagnjeci sote u mesanom povrcu" -> {
                try ( FileReader fr
                        = new FileReader("jagnjeci_sote_povrce.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Musaka od karfiola" -> {
                try ( FileReader fr
                        = new FileReader("musaka_karfiol.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Musaka od kelja" -> {
                try ( FileReader fr
                        = new FileReader("musaka_kelj.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kupus kalja" -> {
                try ( FileReader fr
                        = new FileReader("kupus_kalja.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Musaka od svezeg kupusa" -> {
                try ( FileReader fr
                        = new FileReader("musaka_kupus.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kiseli kupus sa suvim svinjskim mesom" -> {
                try ( FileReader fr
                        = new FileReader("kupus_suvo_meso.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Podvarak sa svinjetinom" -> {
                try ( FileReader fr
                        = new FileReader("podvarak_meso.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Podvarak sa curetinom" -> {
                try ( FileReader fr
                        = new FileReader("podvarak_curetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sekelji gulas" -> {
                try ( FileReader fr
                        = new FileReader("sekelji.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Bograc (kazanski) gulas" -> {
                try ( FileReader fr
                        = new FileReader("bograc.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Juneci odrezak \"madjarski\"" -> {
                try ( FileReader fr
                        = new FileReader("juneci_odrezak_madjarski.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kapama jagnjeca" -> {
                try ( FileReader fr
                        = new FileReader("kapama.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Becar paprikas" -> {
                try ( FileReader fr
                        = new FileReader("becar.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Djuvec (kasapski) sa mesom" -> {
                try ( FileReader fr
                        = new FileReader("djuvec_meso.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Musaka od plavih patlidzana" -> {
                try ( FileReader fr
                        = new FileReader("musaka_patlidzan.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Musaka od tikvica" -> {
                try ( FileReader fr
                        = new FileReader("musaka_tikvice.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Teleca prsa u povrcu" -> {
                try ( FileReader fr
                        = new FileReader("teleca_prsa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Bosanski lonac" -> {
                try ( FileReader fr
                        = new FileReader("bosanski_lonac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Janija sa junetinom (vinogradarska)" -> {
                try ( FileReader fr
                        = new FileReader("janija_junetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Janija sa jagnjetinom (vinogradarska)" -> {
                try ( FileReader fr
                        = new FileReader("janija_jagnjeca.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Papazjanija" -> {
                try ( FileReader fr
                        = new FileReader("papazjanija.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Vinogradarski krompir sa junetinom" -> {
                try ( FileReader fr
                        = new FileReader("vinogradarski_krompir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Vinogradarski krompir sa teletinom" -> {
                try ( FileReader fr
                        = new FileReader("vinogradarski_krompir_teletina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Vinogradarski krompir sa jagnjetinom" -> {
                try ( FileReader fr
                        = new FileReader("vinogradarski_krompir_jagnjetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krompir gulas sa govedinom" -> {
                try ( FileReader fr
                        = new FileReader("krompir_gulas_govedina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krompir paprikas sa teletinom" -> {
                try ( FileReader fr
                        = new FileReader("krompir_paprikas_teletina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krompir paprikas sa svinjetinom" -> {
                try ( FileReader fr
                        = new FileReader("krompir_paprikas_svinjetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krompir paprikas sa jagnjetinom" -> {
                try ( FileReader fr
                        = new FileReader("krompir_paprikas_jagnjetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krompir paprikas sa piletinom" -> {
                try ( FileReader fr
                        = new FileReader("krompir_paprikas_piletina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krompir gulas sa mesnim konzervama" -> {
                try ( FileReader fr
                        = new FileReader("krompir_gulas_konzerva.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krompir paprikas sa mesnim konzervama" -> {
                try ( FileReader fr
                        = new FileReader("krompir_paprikas_konzerva.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Lovacki krompir sa mesom" -> {
                try ( FileReader fr
                        = new FileReader("lovacki_krompir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Musaka od krompira" -> {
                try ( FileReader fr
                        = new FileReader("musaka_krompir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Musaka od krompira sa tunjevinom" -> {
                try ( FileReader fr
                        = new FileReader("musaka_tunjevina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pekarski krompir sa kobasicom" -> {
                try ( FileReader fr
                        = new FileReader("pekarski_krompir_kobasice.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pekarski krompir sa slaninom" -> {
                try ( FileReader fr
                        = new FileReader("pekarski_krompir_slanina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sarma od svezeg kupusa" -> {
                try ( FileReader fr
                        = new FileReader("sarma_svezi_kupus.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sarma od kiselog kupusa" -> {
                try ( FileReader fr
                        = new FileReader("sarma_kiseli_kupus.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sarma od zelja (rastike)" -> {
                try ( FileReader fr
                        = new FileReader("sarma_zelje.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Punjene paprike" -> {
                try ( FileReader fr
                        = new FileReader("punjene_paprike.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Punjene tikvice" -> {
                try ( FileReader fr
                        = new FileReader("punjene_tikvice.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Svinjski kotlet \"samoborski\"" -> {
                try ( FileReader fr
                        = new FileReader("svinjski_kotlet.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Svinjski navaren" -> {
                try ( FileReader fr
                        = new FileReader("svinjski_navaren.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pile u supi sa povrcem" -> {
                try ( FileReader fr
                        = new FileReader("pile_supa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pileca janija" -> {
                try ( FileReader fr
                        = new FileReader("pileca_janija.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pecena piletina \"dobra domacica\"" -> {
                try ( FileReader fr
                        = new FileReader("pecena_piletina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Punjeno pile \"Palermo\"" -> {
                try ( FileReader fr
                        = new FileReader("palermo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pecena curetina na \"vrtlarski\" nacin" -> {
                try ( FileReader fr
                        = new FileReader("pecena_curetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Socivo sa slaninom" -> {
                try ( FileReader fr
                        = new FileReader("socivo_slanina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pasulj sa suvom slaninom" -> {
                try ( FileReader fr
                        = new FileReader("pasulj_slanina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Vojnicki pasulj" -> {
                try ( FileReader fr
                        = new FileReader("vojnicki_pasulj.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Ovciji kasulet" -> {
                try ( FileReader fr
                        = new FileReader("kasulet.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pasulj sa tunjevinom" -> {
                try ( FileReader fr
                        = new FileReader("pasulj_tunjevina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kacamak (palenta) sa sirom" -> {
                try ( FileReader fr
                        = new FileReader("kacamak_sir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kacamak (palenta) sa sirom i kajmakom" -> {
                try ( FileReader fr
                        = new FileReader("kacamak_kajmak.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Gratinirani kacamak sa mesom" -> {
                try ( FileReader fr
                        = new FileReader("kacamak_meso.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Gratinirani kacamak sa kranjskom kobasicom" -> {
                try ( FileReader fr
                        = new FileReader("kacamak_kobasica.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Gratinirani kaneloni sa mesom" -> {
                try ( FileReader fr
                        = new FileReader("kaneloni.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Testenina sa sirom" -> {
                try ( FileReader fr
                        = new FileReader("testenina_sir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Gratinirane makarone" -> {
                try ( FileReader fr
                        = new FileReader("gratinirane_makarone.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Testenina u paradajz sosu sa mlevenim mesom" -> {
                try ( FileReader fr
                        = new FileReader("testenina_sos.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Makarone na mornarski nacin" -> {
                try ( FileReader fr
                        = new FileReader("makarone_mornarske.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Spagete na bolonjski nacin" -> {
                try ( FileReader fr
                        = new FileReader("spagete_bolonjeze.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Spagete na milanski nacin sa suvim mesom" -> {
                try ( FileReader fr
                        = new FileReader("spagete_milaneze.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Spagete na milanski nacin sa kobasicama" -> {
                try ( FileReader fr
                        = new FileReader("spagete_milaneze_kobasica.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Musaka od testenine sa mesom" -> {
                try ( FileReader fr
                        = new FileReader("musaka_testenina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rizi-bizi sa teletinom" -> {
                try ( FileReader fr
                        = new FileReader("rizi_bizi_teletina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rizi-bizi sa svinjetinom" -> {
                try ( FileReader fr
                        = new FileReader("rizi_bizi_svinjetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rizi-bizi sa jagnjetinom" -> {
                try ( FileReader fr
                        = new FileReader("rizi_bizi_jagnjetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rizi-bizi sa piletinom" -> {
                try ( FileReader fr
                        = new FileReader("rizi_bizi_piletina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Grcko cufte" -> {
                try ( FileReader fr
                        = new FileReader("grcko_cufte.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pilav sa junetinom" -> {
                try ( FileReader fr
                        = new FileReader("pilav_junetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pilav sa teletinom" -> {
                try ( FileReader fr
                        = new FileReader("pilav_teletina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pilav sa svinjetinom" -> {
                try ( FileReader fr
                        = new FileReader("pilav_svinjetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pilav sa jagnjetinom" -> {
                try ( FileReader fr
                        = new FileReader("pilav_jagnjetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pilav sa piletinom" -> {
                try ( FileReader fr
                        = new FileReader("pilav_piletina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rizoto sa teletinom" -> {
                try ( FileReader fr
                        = new FileReader("rizoto_teletina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rizoto sa svinjetinom" -> {
                try ( FileReader fr
                        = new FileReader("rizoto_svinjetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rizoto sa jagnjetinom" -> {
                try ( FileReader fr
                        = new FileReader("rizoto_jagnjetina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rizoto sa piletinom" -> {
                try ( FileReader fr
                        = new FileReader("rizoto_piletina.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rizoto sa konzervama gulasa" -> {
                try ( FileReader fr
                        = new FileReader("rizoto_gulas.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rizoto sa konzervama paprikasa" -> {
                try ( FileReader fr
                        = new FileReader("rizoto_paprikas.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rizoto sa ribom" -> {
                try ( FileReader fr
                        = new FileReader("rizoto_riba.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Popara sa sirom" -> {
                try ( FileReader fr
                        = new FileReader("popara_sir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Popara od dvopeka" -> {
                try ( FileReader fr
                        = new FileReader("popara_dvopek.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Mladi sir sa pavlakom (vrhnjem)" -> {
                try ( FileReader fr
                        = new FileReader("sir_pavlaka.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pihtije" -> {
                try ( FileReader fr
                        = new FileReader("pihtije.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata zelena" -> {
                try ( FileReader fr
                        = new FileReader("salata_zelena.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od mladog luka" -> {
                try ( FileReader fr
                        = new FileReader("salata_luk.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od crnog luka" -> {
                try ( FileReader fr
                        = new FileReader("salata_crni_luk.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od svezih krastavaca" -> {
                try ( FileReader fr
                        = new FileReader("salata_krastavac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od svezeg paradajza" -> {
                try ( FileReader fr
                        = new FileReader("salata_paradajz.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od svezeg kupusa" -> {
                try ( FileReader fr
                        = new FileReader("salata_kupus.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od sveze mrkve" -> {
                try ( FileReader fr
                        = new FileReader("salata_mrkva.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od hrena" -> {
                try ( FileReader fr
                        = new FileReader("salata_hren.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od kiselih krastavaca" -> {
                try ( FileReader fr
                        = new FileReader("salata_kiseli_krastavac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od kiselih paprika" -> {
                try ( FileReader fr
                        = new FileReader("salata_kisela_paprika.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od kiselog paradajza" -> {
                try ( FileReader fr
                        = new FileReader("salata_kiseli_paradajz.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od kiselih paprika u listu" -> {
                try ( FileReader fr
                        = new FileReader("salata_kisela_paprika_list.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od kiselog kupusa" -> {
                try ( FileReader fr
                        = new FileReader("salata_kiseli_kupus.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata (mesana) od svezeg povrca" -> {
                try ( FileReader fr
                        = new FileReader("salata_mesana.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata (mesana) od kiselog povrca" -> {
                try ( FileReader fr
                        = new FileReader("salata_mesana_kisela.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od konzervisanog mesanog povrca" -> {
                try ( FileReader fr
                        = new FileReader("salata_mesana_konzerva.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Srpska salata" -> {
                try ( FileReader fr
                        = new FileReader("srpska_salata.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Bosanska salata" -> {
                try ( FileReader fr
                        = new FileReader("bosanska_salata.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od boranije" -> {
                try ( FileReader fr
                        = new FileReader("salata_boranija.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od cvekle" -> {
                try ( FileReader fr
                        = new FileReader("salata_cvekla.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od karfiola" -> {
                try ( FileReader fr
                        = new FileReader("salata_karfiol.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od krompira" -> {
                try ( FileReader fr
                        = new FileReader("salata_krompir.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od pasulja" -> {
                try ( FileReader fr
                        = new FileReader("salata_pasulj.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Salata od pecenih paprika" -> {
                try ( FileReader fr
                        = new FileReader("salata_pecene_paprike.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Ajvar salata" -> {
                try ( FileReader fr
                        = new FileReader("ajvar_salata.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kongres salata" -> {
                try ( FileReader fr
                        = new FileReader("kongres_salata.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Francuska salata" -> {
                try ( FileReader fr
                        = new FileReader("francuska_salata.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Ruska salata sa suvim mesom" -> {
                try ( FileReader fr
                        = new FileReader("ruska_salata_suvo_meso.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Ruska salata sa sunkaricom" -> {
                try ( FileReader fr
                        = new FileReader("ruska_salata_sunkarica.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kompot od suvog voca" -> {
                try ( FileReader fr
                        = new FileReader("kompot_suvo_voce.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kompot od svezeg voca" -> {
                try ( FileReader fr
                        = new FileReader("kompot_sveze_voce.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Vocna salata" -> {
                try ( FileReader fr
                        = new FileReader("vocna_salata.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Puding sa vocnim sirupom" -> {
                try ( FileReader fr
                        = new FileReader("puding_sirup.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sato od vanile" -> {
                try ( FileReader fr
                        = new FileReader("sato_vanila.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sato od vina" -> {
                try ( FileReader fr
                        = new FileReader("sato_vino.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Snenokle" -> {
                try ( FileReader fr
                        = new FileReader("snenokle.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sutlijas" -> {
                try ( FileReader fr
                        = new FileReader("sutlijas.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Koh od pirinca" -> {
                try ( FileReader fr
                        = new FileReader("koh_pirinac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Koh od griza" -> {
                try ( FileReader fr
                        = new FileReader("koh_griz.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Testenina sa secerom" -> {
                try ( FileReader fr
                        = new FileReader("testenina_secer.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Knedle sa svezim vocem" -> {
                try ( FileReader fr
                        = new FileReader("knedle_sveze_voce.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Knedle sa suvim vocem" -> {
                try ( FileReader fr
                        = new FileReader("knedle_suvo_voce.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Knedle sa marmeladom" -> {
                try ( FileReader fr
                        = new FileReader("knedle_marmelada.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Palacinke" -> {
                try ( FileReader fr
                        = new FileReader("palacinke.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Ustipci" -> {
                try ( FileReader fr
                        = new FileReader("ustipci.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Masa-nadev od svezeg voca za kolace" -> {
                try ( FileReader fr
                        = new FileReader("masa_sveze_voce.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Tufahije" -> {
                try ( FileReader fr
                        = new FileReader("tufahije.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Kiselo testo" -> {
                try ( FileReader fr
                        = new FileReader("kiselo_testo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krofne" -> {
                try ( FileReader fr
                        = new FileReader("krofne.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Buhtle" -> {
                try ( FileReader fr
                        = new FileReader("buhtle.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Strudla sa vocem (od kiselog testa)" -> {
                try ( FileReader fr
                        = new FileReader("strudla_voce.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Testo za razvijanje kora (vuceno testo)" -> {
                try ( FileReader fr
                        = new FileReader("vuceno_testo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Baklava" -> {
                try ( FileReader fr
                        = new FileReader("baklava.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Strudla od voca sa vucenim testom" -> {
                try ( FileReader fr
                        = new FileReader("strudla_vuceno_testo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Strudla od voca sa ind. testanim korama" -> {
                try ( FileReader fr
                        = new FileReader("strudla_kore.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pita bundevara sa vucenim testom" -> {
                try ( FileReader fr
                        = new FileReader("pita_testo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pita bundevara sa ind. testanim korama" -> {
                try ( FileReader fr
                        = new FileReader("pita_kore.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Lenja pita sa svezim vocem i marmeladom" -> {
                try ( FileReader fr
                        = new FileReader("lenja_pita.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sam" -> {
                try ( FileReader fr
                        = new FileReader("sam.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krem od vanile" -> {
                try ( FileReader fr
                        = new FileReader("krem_vanila.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krem od maslaca" -> {
                try ( FileReader fr
                        = new FileReader("krem_maslac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krem od margarina" -> {
                try ( FileReader fr
                        = new FileReader("krem_margarin.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Princes krofne" -> {
                try ( FileReader fr
                        = new FileReader("princes_krofne.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Lisnato testo" -> {
                try ( FileReader fr
                        = new FileReader("lisnato_testo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Krem pita" -> {
                try ( FileReader fr
                        = new FileReader("krem_pita.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sam pita" -> {
                try ( FileReader fr
                        = new FileReader("sam_pita.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Sam rolne" -> {
                try ( FileReader fr
                        = new FileReader("sam_rolne.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Tirolska strudla" -> {
                try ( FileReader fr
                        = new FileReader("tirolska_strudla.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Biskvit masa" -> {
                try ( FileReader fr
                        = new FileReader("biskvit_masa.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Patispanja zalivena" -> {
                try ( FileReader fr
                        = new FileReader("patispanja.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Preliv od secera (\"lajter\")" -> {
                try ( FileReader fr
                        = new FileReader("lajter.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Biskvit-rolat sa marmeladom" -> {
                try ( FileReader fr
                        = new FileReader("biskvit_marmelada.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Biskvit-rolat sa kremom od maslaca" -> {
                try ( FileReader fr
                        = new FileReader("biskvit_maslac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Biskvit-rolat sa kremom od margarina" -> {
                try ( FileReader fr
                        = new FileReader("biskvit_margarin.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Punc rolat" -> {
                try ( FileReader fr
                        = new FileReader("punc_rolat.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rolat vocni" -> {
                try ( FileReader fr
                        = new FileReader("rolat_vocni.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Rolat cokoladni" -> {
                try ( FileReader fr
                        = new FileReader("rolat_cokoladni.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Snit torta sa kremom od margarina" -> {
                try ( FileReader fr
                        = new FileReader("snit_torta_margarin.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Snit torta sa kremom od maslaca" -> {
                try ( FileReader fr
                        = new FileReader("snit_torta_maslac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Cokolad torta sa kremom od margarina" -> {
                try ( FileReader fr
                        = new FileReader("cokolad_torta_margarin.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Cokolad torta sa kremom od maslaca" -> {
                try ( FileReader fr
                        = new FileReader("cokolad_torta_maslac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Moka odrezak sa kremom od margarina" -> {
                try ( FileReader fr
                        = new FileReader("moka_odrezak_margarin.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Moka odrezak sa kremom od maslaca" -> {
                try ( FileReader fr
                        = new FileReader("moka_odrezak_maslac.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Punc snita" -> {
                try ( FileReader fr
                        = new FileReader("punc_snita.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Vocna snita" -> {
                try ( FileReader fr
                        = new FileReader("vocna_snita.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Puding od vojnickog dvopeka" -> {
                try ( FileReader fr
                        = new FileReader("puding_dvopek.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Koh od vojnickog dvopeka" -> {
                try ( FileReader fr
                        = new FileReader("koh_dvopek.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Gibanica" -> {
                try ( FileReader fr
                        = new FileReader("gibanica.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pita sa sirom sa vucenim testom" -> {
                try ( FileReader fr
                        = new FileReader("pita_sir_vuceno_testo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pita sa sirom sa ind. test. korama" -> {
                try ( FileReader fr
                        = new FileReader("pita_sir_kore.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pita sa krompirom sa vucenim testom" -> {
                try ( FileReader fr
                        = new FileReader("pita_krompir_testo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pita sa krompirom sa ind. test. korama" -> {
                try ( FileReader fr
                        = new FileReader("pita_krompir_kore.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pita sa spanacem sa vucenim korama" -> {
                try ( FileReader fr
                        = new FileReader("pita_spanac_testo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Pita sa spanacem sa ind. test. korama" -> {
                try ( FileReader fr
                        = new FileReader("pita_spanac_kore.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Burek sa mesom i krompirom sa vucenim testom" -> {
                try ( FileReader fr
                        = new FileReader("burek_testo.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Burek sa mesom i krompirom sa ind. test. korama" -> {
                try ( FileReader fr
                        = new FileReader("burek_kore.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            case "Gratinirani dvopek sa sirom" -> {
                try ( FileReader fr
                        = new FileReader("gratinirani_dvopek.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
            default -> {
                try ( FileReader fr
                        = new FileReader("gotova_jela.txt");  BufferedReader br = new BufferedReader(fr)) {
                    read(br, text);
                } catch (Exception e) {
                }
            }
        }
    }

    private void read(BufferedReader br, JTextArea text) throws IOException {
        boolean end = false;
        String s = "";
        while (!end) {
            String pom = br.readLine();
            s = s + pom + "\n";
            if (pom == null) {
                end = true;
            } else {
                text.setText(s);
            }
        }
    }

}
