package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akwa {
    private static final ahyj b = new ahyj("-");
    public final defpackage.ulw a;

    public akwa() {
        this.a = new defpackage.ulw();
    }

    public final void a(int i) {
        defpackage.ulw ulwVar = this.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        defpackage.akvy akvyVar = defpackage.akvy.HEIGHT;
        ulwVar.f(akvyVar, numValueOf);
        this.a.e(akvyVar);
    }

    public final void b(int i) {
        defpackage.ulw ulwVar = this.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        defpackage.akvy akvyVar = defpackage.akvy.WIDTH;
        ulwVar.f(akvyVar, numValueOf);
        this.a.e(akvyVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final java.lang.String c(java.lang.String str) {
        int i;
        java.util.Map.Entry entry;
        java.lang.String str2;
        java.lang.String strK;
        defpackage.ulw ulwVar = this.a;
        ?? r1 = ulwVar.b;
        if (r1.size() == 0) {
            return "";
        }
        ?? r2 = ulwVar.c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = r2.entrySet().iterator();
        java.util.Iterator it2 = r1.entrySet().iterator();
        java.util.Map.Entry entry2 = it.hasNext() ? (java.util.Map.Entry) it.next() : null;
        boolean z = false;
        java.util.Map.Entry entry3 = it2.hasNext() ? (java.util.Map.Entry) it2.next() : null;
        while (true) {
            java.lang.Object obj = ulwVar.a;
            if (entry2 == null && entry3 == null) {
                if (z) {
                    arrayList.add(((java.lang.String) obj).substring(0, 0));
                }
                return !arrayList.isEmpty() ? str.concat(b.b(arrayList)) : "";
            }
            if (entry3 == null) {
                i = 1;
            } else if (entry2 == null) {
                i = 0;
            } else {
                int iCompareTo = ((defpackage.akvy) entry2.getKey()).compareTo((defpackage.akvy) entry3.getKey());
                i = iCompareTo >>> 31;
                if (iCompareTo == 0) {
                    entry2 = null;
                }
            }
            if (i != 0) {
                defpackage.akvz akvzVar = (defpackage.akvz) entry2.getValue();
                if (z) {
                    int i2 = akvzVar.a;
                    arrayList.add(((java.lang.String) obj).substring(0, 0));
                    int i3 = akvzVar.a;
                    int i4 = akvzVar.b;
                } else {
                    int i5 = akvzVar.a;
                    int i6 = akvzVar.b;
                }
                z = true;
                entry2 = null;
            } else {
                defpackage.akvy akvyVar = (defpackage.akvy) entry3.getKey();
                defpackage.akwb akwbVar = (defpackage.akwb) entry3.getValue();
                if (z) {
                    arrayList.add(((java.lang.String) obj).substring(0, 0));
                }
                if (akwbVar.a != null) {
                    boolean z2 = akwbVar.b;
                    java.lang.String str3 = akvyVar.bg;
                    int i7 = akvyVar.bh;
                    int i8 = i7 - 1;
                    if (i7 == 0) {
                        throw null;
                    }
                    switch (i8) {
                        case 0:
                            aish aishVarG = aish.f.g();
                            long jLongValue = ((java.lang.Long) ((defpackage.akwb) entry3.getValue()).a).longValue();
                            char c = '\b';
                            byte[] bArr = new byte[8];
                            int i9 = 7;
                            while (i9 >= 0) {
                                char c2 = c;
                                bArr[i9] = (byte) (jLongValue & 255);
                                jLongValue >>= c2;
                                i9--;
                                c = c2;
                            }
                            entry = null;
                            strK = aishVarG.k(bArr);
                            arrayList.add(java.lang.String.valueOf(str3).concat(java.lang.String.valueOf(strK)));
                            break;
                        case 1:
                            strK = "";
                            entry = null;
                            arrayList.add(java.lang.String.valueOf(str3).concat(java.lang.String.valueOf(strK)));
                            break;
                        case 2:
                            strK = ((java.lang.String) ((defpackage.akwb) entry3.getValue()).a).replace(';', ':');
                            entry = null;
                            arrayList.add(java.lang.String.valueOf(str3).concat(java.lang.String.valueOf(strK)));
                            break;
                        case 3:
                            strK = ((java.lang.Integer) ((defpackage.akwb) entry3.getValue()).a).toString();
                            entry = null;
                            arrayList.add(java.lang.String.valueOf(str3).concat(java.lang.String.valueOf(strK)));
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            strK = ((java.lang.Long) ((defpackage.akwb) entry3.getValue()).a).toString();
                            entry = null;
                            arrayList.add(java.lang.String.valueOf(str3).concat(java.lang.String.valueOf(strK)));
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            strK = ((java.lang.Float) ((defpackage.akwb) entry3.getValue()).a).toString();
                            entry = null;
                            arrayList.add(java.lang.String.valueOf(str3).concat(java.lang.String.valueOf(strK)));
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            java.lang.Integer num = (java.lang.Integer) ((defpackage.akwb) entry3.getValue()).a;
                            num.intValue();
                            strK = "0x".concat(java.lang.String.valueOf(java.lang.String.format("%08x", num)));
                            entry = null;
                            arrayList.add(java.lang.String.valueOf(str3).concat(java.lang.String.valueOf(strK)));
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            strK = aish.f.g().k(((java.lang.String) ((defpackage.akwb) entry3.getValue()).a).getBytes(java.nio.charset.StandardCharsets.ISO_8859_1)).replace('-', '~');
                            entry = null;
                            arrayList.add(java.lang.String.valueOf(str3).concat(java.lang.String.valueOf(strK)));
                            break;
                        default:
                            switch (i7) {
                                case 1:
                                    str2 = "FIXED_LENGTH_BASE_64";
                                    break;
                                case 2:
                                    str2 = "BOOLEAN";
                                    break;
                                case 3:
                                    str2 = "STRING";
                                    break;
                                case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                                    str2 = "INTEGER";
                                    break;
                                case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                                    str2 = "LONG";
                                    break;
                                case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                                    str2 = "FLOAT";
                                    break;
                                case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                                    str2 = "PREFIX_HEX";
                                    break;
                                default:
                                    str2 = "FIFE_SAFE_BASE_64";
                                    break;
                            }
                            throw new java.lang.IllegalStateException(a.bk(str2, "OptionType ", " not handled."));
                    }
                } else {
                    entry = null;
                }
                entry3 = entry;
                z = false;
            }
            if (entry2 == null && it.hasNext()) {
                entry2 = (java.util.Map.Entry) it.next();
            }
            if (entry3 == null && it2.hasNext()) {
                entry3 = (java.util.Map.Entry) it2.next();
            }
        }
    }

    public akwa(defpackage.ulw ulwVar) {
        this.a = new defpackage.ulw(ulwVar);
    }
}
