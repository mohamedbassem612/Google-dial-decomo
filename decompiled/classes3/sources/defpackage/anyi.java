package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class anyi {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anyi.class.getName());

    private anyi() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: akez */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static java.lang.Object a(akex akexVar) throws akez {
        double d;
        ahvr.bZ(akexVar.s(), "unexpected end of JSON");
        int iB = akexVar.b() - 1;
        if (iB == 0) {
            akexVar.m();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (akexVar.s()) {
                arrayList.add(a(akexVar));
            }
            ahvr.bZ(akexVar.b() == 2, "Bad token: ".concat(akexVar.u()));
            akexVar.o();
            return j$.util.DesugarCollections.unmodifiableList(arrayList);
        }
        if (iB == 2) {
            akexVar.n();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            while (akexVar.s()) {
                java.lang.String strI = akexVar.i();
                ahvr.bR(!linkedHashMap.containsKey(strI), "Duplicate key found: %s", strI);
                linkedHashMap.put(strI, a(akexVar));
            }
            ahvr.bZ(akexVar.b() == 4, "Bad token: ".concat(akexVar.u()));
            akexVar.p();
            return j$.util.DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        if (iB == 5) {
            return akexVar.k();
        }
        if (iB != 6) {
            if (iB == 7) {
                return java.lang.Boolean.valueOf(akexVar.t());
            }
            if (iB != 8) {
                throw new java.lang.IllegalStateException("Bad token: ".concat(akexVar.u()));
            }
            akexVar.q();
            return null;
        }
        int iC = akexVar.e;
        if (iC == 0) {
            iC = akexVar.c();
        }
        if (iC != 15) {
            if (iC != 16) {
                switch (iC) {
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        akexVar.h = akexVar.j(iC == 8 ? '\'' : '\"');
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        akexVar.h = akexVar.l();
                        break;
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        break;
                    default:
                        throw akexVar.g("a double");
                }
            } else {
                char[] cArr = akexVar.c;
                int i = akexVar.d;
                int i2 = akexVar.g;
                akexVar.h = new java.lang.String(cArr, i, i2);
                akexVar.d = i + i2;
            }
            akexVar.e = 11;
            try {
                d = java.lang.Double.parseDouble(akexVar.h);
                if (akexVar.b != akej.a && (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d))) {
                    throw akexVar.f("JSON forbids NaN and infinities: " + d);
                }
                akexVar.h = null;
                akexVar.e = 0;
                int[] iArr = akexVar.j;
                int i3 = akexVar.i - 1;
                iArr[i3] = iArr[i3] + 1;
            } catch (java.lang.NumberFormatException e) {
                java.lang.NumberFormatException numberFormatException = new java.lang.NumberFormatException("Expected a double but was " + akexVar.h + akexVar.h());
                numberFormatException.initCause(e);
                throw numberFormatException;
            }
        } else {
            akexVar.e = 0;
            int[] iArr2 = akexVar.j;
            int i4 = akexVar.i - 1;
            iArr2[i4] = iArr2[i4] + 1;
            d = akexVar.f;
        }
        return java.lang.Double.valueOf(d);
    }
}
