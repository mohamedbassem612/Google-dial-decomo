package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fmo {
    public static final java.lang.String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final java.lang.String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final java.lang.String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static defpackage.ajml a(java.lang.String str) {
        long j;
        aify aifyVarQ;
        try {
            org.xmlpull.v1.XmlPullParser xmlPullParserNewPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new java.io.StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!defpackage.esv.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw new defpackage.era("Couldn't find xmp metadata", null, true, 1);
            }
            aify aifyVar = aike.a;
            aify aifyVarB = aifyVar;
            long j2 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (defpackage.esv.f(xmlPullParserNewPullParser, "rdf:Description")) {
                    java.lang.String[] strArr = a;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        java.lang.String strD = defpackage.esv.d(xmlPullParserNewPullParser, strArr[i2]);
                        if (strD != null) {
                            if (java.lang.Integer.parseInt(strD) != 1) {
                                return null;
                            }
                            java.lang.String[] strArr2 = b;
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    java.lang.String strD2 = defpackage.esv.d(xmlPullParserNewPullParser, strArr2[i3]);
                                    if (strD2 != null) {
                                        j = java.lang.Long.parseLong(strD2);
                                        if (j != -1) {
                                            break;
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                break;
                            }
                            java.lang.String[] strArr3 = c;
                            while (true) {
                                if (i >= 2) {
                                    aifyVarQ = aifyVar;
                                    break;
                                }
                                java.lang.String strD3 = defpackage.esv.d(xmlPullParserNewPullParser, strArr3[i]);
                                if (strD3 != null) {
                                    aifyVarQ = aify.q(new defpackage.fti("image/jpeg", 0L, 0L), new defpackage.fti("video/mp4", java.lang.Long.parseLong(strD3), 0L));
                                    break;
                                }
                                i++;
                            }
                            long j3 = j;
                            aifyVarB = aifyVarQ;
                            j2 = j3;
                        }
                    }
                    return null;
                }
                if (defpackage.esv.f(xmlPullParserNewPullParser, "Container:Directory")) {
                    aifyVarB = b(xmlPullParserNewPullParser, "Container", "Item");
                } else if (defpackage.esv.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    aifyVarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!defpackage.esv.e(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (aifyVarB.isEmpty()) {
                return null;
            }
            return new defpackage.ajml(j2, aifyVarB);
        } catch (defpackage.era | java.lang.NumberFormatException | org.xmlpull.v1.XmlPullParserException unused) {
            defpackage.etr.f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static aify b(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, java.lang.String str2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        aift aiftVar = new aift(4);
        do {
            java.lang.String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (defpackage.esv.f(xmlPullParser, strConcat)) {
                java.lang.String strConcat2 = str2.concat(":Mime");
                java.lang.String strConcat3 = str2.concat(":Semantic");
                java.lang.String strConcat4 = str2.concat(":Length");
                java.lang.String strConcat5 = str2.concat(":Padding");
                java.lang.String strD = defpackage.esv.d(xmlPullParser, strConcat2);
                java.lang.String strD2 = defpackage.esv.d(xmlPullParser, strConcat3);
                java.lang.String strD3 = defpackage.esv.d(xmlPullParser, strConcat4);
                java.lang.String strD4 = defpackage.esv.d(xmlPullParser, strConcat5);
                if (strD == null || strD2 == null) {
                    return aike.a;
                }
                aiftVar.i(new defpackage.fti(strD, strD3 != null ? java.lang.Long.parseLong(strD3) : 0L, strD4 != null ? java.lang.Long.parseLong(strD4) : 0L));
            }
        } while (!defpackage.esv.e(xmlPullParser, str.concat(":Directory")));
        return aiftVar.h();
    }
}
