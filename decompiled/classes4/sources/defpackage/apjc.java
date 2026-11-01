package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apjc extends apjk {
    public static final apiy a;
    public static final apiy b;
    private static final byte[] c;
    private static final byte[] d;
    private static final byte[] e;
    private final appb f;
    private final apiy g;
    private final java.util.List h;
    private final apiy i;
    private long j;

    static {
        aorg aorgVar = apiy.a;
        a = aooh.R("multipart/mixed");
        aooh.R("multipart/alternative");
        aooh.R("multipart/digest");
        aooh.R("multipart/parallel");
        b = aooh.R("multipart/form-data");
        c = new byte[]{58, 32};
        d = new byte[]{13, 10};
        e = new byte[]{45, 45};
    }

    public apjc(appb appbVar, apiy apiyVar, java.util.List list) {
        aooh.f(apiyVar, "type");
        aooh.f(list, "parts");
        this.f = appbVar;
        this.g = apiyVar;
        this.h = list;
        aorg aorgVar = apiy.a;
        this.i = aooh.R(apiyVar + "; boundary=" + appbVar.i());
        this.j = -1L;
    }

    public final long a() {
        long j = this.j;
        if (j != -1) {
            return j;
        }
        long jB = b(null, true);
        this.j = jB;
        return jB;
    }

    public final long b(apoz apozVar, boolean z) {
        apoz apoyVar;
        apoz apozVar2;
        if (z) {
            apoyVar = new apoy();
            apozVar2 = apoyVar;
        } else {
            apoyVar = apozVar;
            apozVar2 = null;
        }
        java.util.List list = this.h;
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            defpackage.apjb apjbVar = (defpackage.apjb) list.get(i);
            java.lang.Object obj = apjbVar.a;
            java.lang.Object obj2 = apjbVar.b;
            aooh.c(apoyVar);
            apoyVar.aa(e);
            apoyVar.J(this.f);
            byte[] bArr = d;
            apoyVar.aa(bArr);
            apiu apiuVar = (apiu) obj;
            int iA = apiuVar.a();
            for (int i2 = 0; i2 < iA; i2++) {
                apoyVar.ab(aoov.be(apiuVar, i2));
                apoyVar.aa(c);
                apoyVar.ab(aoov.bf(apiuVar, i2));
                apoyVar.aa(bArr);
            }
            apjk apjkVar = (apjk) obj2;
            apiy apiyVarC = apjkVar.c();
            if (apiyVarC != null) {
                apoyVar.ab("Content-Type: ");
                apoyVar.ab(apiyVarC.c);
                apoyVar.aa(bArr);
            }
            long jA = apjkVar.a();
            if (jA == -1) {
                if (z) {
                    aooh.c(apozVar2);
                    apozVar2.y();
                    return -1L;
                }
                jA = -1;
            }
            apoyVar.aa(bArr);
            if (z) {
                j += jA;
            } else {
                apoz apozVarAK = aoov.aK(new defpackage.apja(apoyVar));
                try {
                    ((apjk) obj2).d(apozVarAK);
                    ajsz.ak(apozVarAK, (java.lang.Throwable) null);
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(apozVarAK, th);
                        throw th2;
                    }
                }
            }
            apoyVar.aa(bArr);
        }
        aooh.c(apoyVar);
        byte[] bArr2 = e;
        apoyVar.aa(bArr2);
        apoyVar.J(this.f);
        apoyVar.aa(bArr2);
        apoyVar.aa(d);
        if (!z) {
            return j;
        }
        aooh.c(apozVar2);
        long j2 = j + ((apoy) apozVar2).b;
        apozVar2.y();
        return j2;
    }

    public final apiy c() {
        return this.i;
    }

    public final void d(apoz apozVar) {
        b(apozVar, false);
    }
}
