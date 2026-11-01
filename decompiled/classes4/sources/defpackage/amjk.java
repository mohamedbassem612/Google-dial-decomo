package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amjk {
    public static volatile defpackage.anpk a;
    public static volatile defpackage.anpk b;
    public static volatile defpackage.anpk c;
    public static volatile defpackage.anpk d;

    private amjk() {
    }

    public static defpackage.amjj a(anmc anmcVar) {
        return (defpackage.amjj) defpackage.amjj.b(new defpackage.ajeb(4), anmcVar);
    }

    public static int b(int i) {
        if (i != 0) {
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static final /* synthetic */ void c(defpackage.amgz amgzVar, akzx akzxVar) {
        aooh.f(amgzVar, "value");
        akzxVar.u();
        defpackage.amha amhaVar = (defpackage.amha) akzxVar.b;
        defpackage.amha amhaVar2 = defpackage.amha.a;
        j$.util.Objects.requireNonNull(amgzVar);
        alat alatVar = amhaVar.e;
        if (!alatVar.c()) {
            amhaVar.e = alad.J(alatVar);
        }
        amhaVar.e.add(amgzVar);
    }

    public static final /* synthetic */ void d(akzx akzxVar) {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.amha) akzxVar.b).e);
        aooh.e(listUnmodifiableList, "getIntentsList(...)");
        new alct(listUnmodifiableList);
    }

    public static int e(int i) {
        if (i == 0) {
            return 8;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        switch (i) {
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return 7;
            default:
                return 0;
        }
    }

    public static /* synthetic */ java.lang.String f(java.lang.Iterable iterable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((java.lang.CharSequence) "");
            }
        }
        return sb.toString();
    }

    public static defpackage.amed g() {
        defpackage.amed amedVar = new defpackage.amed();
        amedVar.b();
        amedVar.c();
        amedVar.d();
        return amedVar;
    }

    public static aify h(java.util.List list, java.util.List list2) {
        aift aiftVar = new aift(4);
        if (list2.isEmpty()) {
            aiftVar.i(list);
            return aiftVar.h();
        }
        int iIntValue = ((java.lang.Integer) list2.get(0)).intValue();
        aiftVar.i(list.subList(0, iIntValue < list.size() + (-1) ? iIntValue + 1 : list.size()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 1; i < list2.size(); i++) {
            int iIntValue2 = (((java.lang.Integer) list2.get(i)).intValue() - iIntValue) - 1;
            if (iIntValue2 >= 0) {
                arrayList.add(java.lang.Integer.valueOf(iIntValue2));
            }
        }
        aiftVar.k(h(list.subList(iIntValue + 1, list.size()), arrayList));
        return aiftVar.h();
    }

    public static /* synthetic */ java.lang.String i(java.lang.CharSequence charSequence, java.lang.Iterable iterable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }

    public static defpackage.amfk j(java.io.InputStream inputStream) throws defpackage.amca {
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(javax.crypto.SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(new javax.crypto.spec.PBEKeySpec(new char[]{'O', 'b', 'f', 'u', 's', 'c', 'a', 't', 'i', 'o', 'n', 'K', 'e', 'y'}, "ObfuscationSalt".getBytes(java.nio.charset.Charset.defaultCharset()), 65536, 256)).getEncoded(), "AES");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec("0000000000000000".getBytes(java.nio.charset.Charset.defaultCharset())));
            return (defpackage.amfk) alad.B(defpackage.amfk.a, cipher.doFinal(aisk.b(inputStream)), akzq.a());
        } catch (alaz | java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | java.security.spec.InvalidKeySpecException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
            throw new defpackage.amca(e);
        }
    }

    public static int k(int i) {
        return i == 1 ? alau.a() : i - 2;
    }

    public static int l(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 2;
        }
        return 1;
    }

    public static final /* synthetic */ zoe m(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static final /* synthetic */ vaa n(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static final /* synthetic */ defpackage.ajyi o(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ajyi(akzxVar);
    }

    public static final /* synthetic */ defpackage.ajyi p(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ajyi(akzxVar);
    }
}
