package com.example.smt_authorizationservice.bc.utilities;

import java.util.HashMap;
import java.util.Map;

public class BinMapper {
    private static final Map<String, String[]> binMap = new HashMap<>();

    static {
        // BCR
        binMap.put("223107", new String[]{"BCR", "MASTERCARD"});
        binMap.put("402478", new String[]{"BCR", "VISA"});
        binMap.put("404265", new String[]{"BCR", "VISA"});
        binMap.put("409627", new String[]{"BCR", "VISA"});
        binMap.put("410372", new String[]{"BCR", "VISA"});
        binMap.put("414282", new String[]{"BCR", "VISA"});
        binMap.put("415276", new String[]{"BCR", "VISA"});
        binMap.put("415277", new String[]{"BCR", "VISA"});
        binMap.put("415278", new String[]{"BCR", "VISA"});
        binMap.put("426016", new String[]{"BCR", "VISA"});
        binMap.put("431069", new String[]{"BCR", "VISA"});
        binMap.put("432394", new String[]{"BCR", "VISA"});
        binMap.put("432395", new String[]{"BCR", "VISA"});
        binMap.put("433086", new String[]{"BCR", "VISA"});
        binMap.put("434889", new String[]{"BCR", "VISA"});
        binMap.put("434891", new String[]{"BCR", "VISA"});
        binMap.put("434927", new String[]{"BCR", "VISA"});
        binMap.put("437993", new String[]{"BCR", "VISA"});
        binMap.put("437994", new String[]{"BCR", "VISA"});
        binMap.put("437995", new String[]{"BCR", "VISA"});
        binMap.put("438098", new String[]{"BCR", "VISA"});
        binMap.put("448705", new String[]{"BCR", "VISA"});
        binMap.put("448721", new String[]{"BCR", "VISA"});
        binMap.put("451414", new String[]{"BCR", "VISA"});
        binMap.put("451448", new String[]{"BCR", "VISA"});
        binMap.put("456700", new String[]{"BCR", "VISA"});
        binMap.put("461164", new String[]{"BCR", "VISA"});
        binMap.put("472057", new String[]{"BCR", "VISA"});
        binMap.put("476038", new String[]{"BCR", "VISA"});
        binMap.put("482128", new String[]{"BCR", "VISA"});
        binMap.put("482129", new String[]{"BCR", "VISA"});
        binMap.put("482130", new String[]{"BCR", "VISA"});
        binMap.put("492409", new String[]{"BCR", "VISA"});
        binMap.put("498454", new String[]{"BCR", "VISA"});
        binMap.put("498455", new String[]{"BCR", "VISA"});
        binMap.put("498456", new String[]{"BCR", "VISA"});
        binMap.put("510209", new String[]{"BCR", "MASTERCARD"});
        binMap.put("512684", new String[]{"BCR", "MASTERCARD"});
        binMap.put("512723", new String[]{"BCR", "MASTERCARD"});
        binMap.put("516327", new String[]{"BCR", "MASTERCARD"});
        binMap.put("518678", new String[]{"BCR", "MASTERCARD"});
        binMap.put("519618", new String[]{"BCR", "MASTERCARD"});
        binMap.put("520638", new String[]{"BCR", "MASTERCARD"});
        binMap.put("524316", new String[]{"BCR", "MASTERCARD"});
        binMap.put("526062", new String[]{"BCR", "MASTERCARD"});
        binMap.put("531990", new String[]{"BCR", "MASTERCARD"});
        binMap.put("547834", new String[]{"BCR", "MASTERCARD"});
        binMap.put("552017", new String[]{"BCR", "MASTERCARD"});
        binMap.put("554634", new String[]{"BCR", "MASTERCARD"});
        binMap.put("558600", new String[]{"BCR", "MASTERCARD"});
        binMap.put("558617", new String[]{"BCR", "MASTERCARD"});

        // BN
        binMap.put("402520", new String[]{"BN", "VISA"});
        binMap.put("404144", new String[]{"BN", "VISA"});
        binMap.put("404980", new String[]{"BN", "VISA"});
        binMap.put("410864", new String[]{"BN", "VISA"});
        binMap.put("419556", new String[]{"BN", "VISA"});
        binMap.put("450776", new String[]{"BN", "VISA"});
        binMap.put("450777", new String[]{"BN", "VISA"});
        binMap.put("451418", new String[]{"BN", "VISA"});
        binMap.put("456337", new String[]{"BN", "VISA"});
        binMap.put("456949", new String[]{"BN", "VISA"});
        binMap.put("456954", new String[]{"BN", "VISA"});
        binMap.put("461131", new String[]{"BN", "VISA"});
        binMap.put("464137", new String[]{"BN", "VISA"});
        binMap.put("473213", new String[]{"BN", "VISA"});
        binMap.put("473214", new String[]{"BN", "VISA"});
        binMap.put("473215", new String[]{"BN", "VISA"});
        binMap.put("473216", new String[]{"BN", "VISA"});
        binMap.put("477280", new String[]{"BN", "VISA"});
        binMap.put("478019", new String[]{"BN", "VISA"});
        binMap.put("483103", new String[]{"BN", "VISA"});
        binMap.put("483126", new String[]{"BN", "VISA"});
        binMap.put("483189", new String[]{"BN", "VISA"});
        binMap.put("483190", new String[]{"BN", "VISA"});
        binMap.put("489353", new String[]{"BN", "VISA"});
        binMap.put("493823", new String[]{"BN", "VISA"});
        binMap.put("493824", new String[]{"BN", "VISA"});
        binMap.put("510714", new String[]{"BN", "MASTERCARD"});
        binMap.put("510980", new String[]{"BN", "MASTERCARD"});
        binMap.put("511906", new String[]{"BN", "MASTERCARD"});
        binMap.put("512905", new String[]{"BN", "MASTERCARD"});
        binMap.put("513237", new String[]{"BN", "MASTERCARD"});
        binMap.put("513460", new String[]{"BN", "MASTERCARD"});
        binMap.put("514006", new String[]{"BN", "MASTERCARD"});
        binMap.put("515575", new String[]{"BN", "MASTERCARD"});
        binMap.put("516651", new String[]{"BN", "MASTERCARD"});
        binMap.put("516662", new String[]{"BN", "MASTERCARD"});
        binMap.put("516681", new String[]{"BN", "MASTERCARD"});
        binMap.put("517784", new String[]{"BN", "MASTERCARD"});
        binMap.put("517871", new String[]{"BN", "MASTERCARD"});
        binMap.put("518207", new String[]{"BN", "MASTERCARD"});
        binMap.put("518209", new String[]{"BN", "MASTERCARD"});
        binMap.put("518214", new String[]{"BN", "MASTERCARD"});
        binMap.put("518230", new String[]{"BN", "MASTERCARD"});
        binMap.put("518231", new String[]{"BN", "MASTERCARD"});
        binMap.put("518232", new String[]{"BN", "MASTERCARD"});
        binMap.put("518258", new String[]{"BN", "MASTERCARD"});
        binMap.put("518259", new String[]{"BN", "MASTERCARD"});
        binMap.put("518260", new String[]{"BN", "MASTERCARD"});
        binMap.put("518263", new String[]{"BN", "MASTERCARD"});
        binMap.put("518269", new String[]{"BN", "MASTERCARD"});
        binMap.put("518290", new String[]{"BN", "MASTERCARD"});
        binMap.put("518439", new String[]{"BN", "MASTERCARD"});
        binMap.put("518541", new String[]{"BN", "MASTERCARD"});
    }

    public static String[] obtenerBancoYMarca(String bin) {
        return binMap.get(bin);
    }
}
