/*
 * The MIT License
 *
 * Copyright 2014 Grzegorz.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package pl.grzegorz2047.openguild2047.managers;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import pl.grzegorz2047.openguild2047.GenConf;

/**
 *
 * @author Grzegorz
 */
public class MsgManager {
    
    private static final File FILE = new File("plugins/OpenGuild2047/messages.yml");
    private static final FileConfiguration CONFIG = YamlConfiguration.loadConfiguration(FILE);
    
    public static String createguildsuccess = get("createguildsuccess", "Gildia zostala pomysnie stworzona.");
    public static String cmdonlyforplayer = get("cmdonlyforplayer", "Komenda jedynie dla graczy na serwerze!");
    public static String alreadyinguild = get("alreadyinguild", "Aby stworzyc nowa gildie musisz najpierw opuscic aktualna!");
    public static String unsupportedchars = get("unsupportedchars", "Nazwa gildii moze zawierac jedynie znaki z tego zakresu [0-9a-zA-Z]");
    public static String toolongshorttag = get("toolongshorttag", "Twoja nazwa gildii jest za dluga badz za krotka!"
            + "\n min. ilosc: "+GenConf.minclantag
            + "\n max. ilosc: "+GenConf.maxclantag).replace("{MIN}", String.valueOf(GenConf.minclantag)).replace("{MAX}", String.valueOf(GenConf.maxclantag));
    public static String illegaltag = get("illegaltag", "Twoja nazwa posiada zabronione slowa!");
    public static String notinguild = get("notinguild", "Aby to wykonac musisz byc w gildii!");
    public static String errornotinguild = get("errornotinguild", "Nie jestes w gildii?! Czyszcze bledne dane!");
    public static String teleportsuccess = get("teleportsuccess", "Zostales pomyslnie przeteleportowany!");
    public static String leaveguildsuccess = get("leaveguildsuccess", "Pomyslnie opusciles gildie!");
    public static String nomembersinguild = get("nomembersinguild", "Aktualnie nie posiadasz zadnych czlonkow w gildii.");
    public static String notenoughitems = get("notenoughitems", "Posiadasz nie wystarczaczajaca liczbe przedmiotow na stworzenie gildii");
    public static String homenotenabled = get("homenotenabled", "Na tym serwerze komenda /gildia dom jest wylaczona!");
    public static String wrongcmdargument = get("wrongcmdargument", "Podales bledny argument!");
    public static String wronguseddesccmd = get("wronguseddesccmd", "Poprawne uzycie: /gildia dom zmien <Tresc>");
    public static String playernotleader = get("playernotleader", "Nie mozesz tego wykonac, poniewaz nie jestes liderem gildii!");
    public static String playerneverplayed = get("playerneverplayed", "Nie mozesz przekazac lidera osobie, ktora nigdy nie grala na serwerze!");
    public static String guilddisbandsuccess = get("guilddisbandsuccess", "Pomyslnie usunieto gildie!");
    public static String gildtocloseothers = get("gildtocloseothers", "Nie mozesz tworzyc gildii blisko innej gildii!");
    public static String playerstooclose = get("playerstooclose", "Nie mozesz stworzyc gildii blisko innych graczy!");
    public static String guildexists = get("guildexists", "Gildia o takiej nazwie juz istnieje!");
    public static String cantdoitonsomeonearea = get("cantdoitonsomeonearea", "Nie mozesz budowac na terenie obcej gildii.");
    public static String guildjoinsuccess = get("guildjoinsuccess", "Pomyslnie dolaczyles do gildii");
    public static String playernotinvited = get("playernotinvited", "Nie jestes zaproszony! Wysylam zapytanie do lidera!");
    public static String askforinvite = get("askforinvite", "Gracz prosi o zaproszenie do gildii. Nick:");
    public static String invitedplayersuccessfullyjoined = get("invitedplayersuccessfullyjoined", "Gracz pomyslnie dolaczyl do twojej gildii!");
    public static String guildinviteaccepted = get("guildinviteaccepted", "twoja prosba o dolaczenie zostala pomyslnie rozpatrzona!");
    public static String playernotoninvitedlist = get("playernotoninvitedlist", "Ten gracz nie jest na liscie zaproszonych!");
    public static String guilddoesntexists = get("guilddoesntexists", "Gildia do ktorej probujesz dolaczyc nie istnieje!");
    public static String leadernotonline = get("leadernotonline", "Lider aktualnie nie jest na serwerze!");
    public static String notyetaccepted = get("notyetaccepted", "Twoja prosba nie zostala jeszcze zaakceptowana");
    public static String desctoolong = get("desctoolong", "Opis gildii jest za dlugi");
    
    public static String get(String path) {
        return get(path, "Wiadomosc nie zostala odnaleziona :(");
    }
    
    public static String get(String path, String def) {
        return CONFIG.getString(path, def).replace("&", "§");
    }
    
}
