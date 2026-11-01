package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gjl implements defpackage.giv {
    final /* synthetic */ defpackage.gjm a;

    public gjl(defpackage.gjm gjmVar) {
        this.a = gjmVar;
    }

    @Override // defpackage.giv
    public final java.lang.String f() {
        return this.a.g;
    }

    @Override // defpackage.giv
    public final void g(defpackage.giu giuVar) {
        defpackage.gjm gjmVar = this.a;
        int length = gjmVar.a.length;
        for (int i = 1; i < length; i++) {
            int i2 = gjmVar.a[i];
            if (i2 == 1) {
                giuVar.c(i, gjmVar.b[i]);
            } else if (i2 == 2) {
                giuVar.b(i, gjmVar.c[i]);
            } else if (i2 == 3) {
                java.lang.String str = gjmVar.d[i];
                if (str == null) {
                    defpackage.aooh.g();
                }
                giuVar.e(i, str);
            } else if (i2 == 4) {
                byte[] bArr = gjmVar.e[i];
                if (bArr == null) {
                    defpackage.aooh.g();
                }
                giuVar.a(i, bArr);
            } else if (i2 == 5) {
                giuVar.d(i);
            }
        }
    }
}
