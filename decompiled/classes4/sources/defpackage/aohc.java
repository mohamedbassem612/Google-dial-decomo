package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aohc implements defpackage.anpi {
    private static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();
    public final albh a;
    private final albn c;

    public aohc(albh albhVar) {
        ahvr.cj(albhVar, "defaultInstance cannot be null");
        this.a = albhVar;
        this.c = albhVar.N();
    }

    @Override // defpackage.anpi
    public final /* bridge */ /* synthetic */ java.io.InputStream a(java.lang.Object obj) {
        return new defpackage.aohb((albh) obj, this.c);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: alaz */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    @Override // defpackage.anpi
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.io.InputStream inputStream) {
        akzf akzfVarJ;
        java.lang.Object objH;
        byte[] bArr;
        if (inputStream instanceof defpackage.aohb) {
            defpackage.aohb aohbVar = (defpackage.aohb) inputStream;
            if (aohbVar.b == this.c) {
                try {
                    albh albhVar = aohbVar.a;
                    if (albhVar == null) {
                        throw new java.lang.IllegalStateException("message not available");
                    }
                    return albhVar;
                } catch (java.lang.IllegalStateException unused) {
                }
            }
        }
        try {
            if (inputStream instanceof defpackage.annz) {
                int iAvailable = inputStream.available();
                if (iAvailable > 0 && iAvailable <= 4194304) {
                    java.lang.ThreadLocal threadLocal = b;
                    java.lang.ref.Reference reference = (java.lang.ref.Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new java.lang.ref.WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i2 = inputStream.read(bArr, iAvailable - i, i);
                        if (i2 == -1) {
                            break;
                        }
                        i -= i2;
                    }
                    if (i != 0) {
                        throw new java.lang.RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                    }
                    akzfVarJ = akzf.O(bArr, 0, iAvailable);
                    if (akzfVarJ == null) {
                        akzfVarJ = akzf.J(inputStream, 4096);
                    }
                    akzfVarJ.g = Integer.MAX_VALUE;
                    objH = this.c.h(akzfVarJ, aohd.a);
                    akzfVarJ.A(0);
                } else if (iAvailable == 0) {
                    objH = this.a;
                } else {
                    akzfVarJ = null;
                    if (akzfVarJ == null) {
                        akzfVarJ = akzf.J(inputStream, 4096);
                    }
                    akzfVarJ.g = Integer.MAX_VALUE;
                    objH = this.c.h(akzfVarJ, aohd.a);
                    akzfVarJ.A(0);
                }
            } else {
                akzfVarJ = null;
                if (akzfVarJ == null) {
                    akzfVarJ = akzf.J(inputStream, 4096);
                }
                akzfVarJ.g = Integer.MAX_VALUE;
                try {
                    objH = this.c.h(akzfVarJ, aohd.a);
                    try {
                        akzfVarJ.A(0);
                    } catch (alaz e) {
                        throw e;
                    }
                } catch (alaz e2) {
                    throw new defpackage.anqz(anqw.k.f("Invalid protobuf byte sequence").e(e2), null);
                }
            }
            return objH;
        } catch (java.io.IOException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }
}
