package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fuh implements defpackage.ftx {
    private defpackage.fmk c;
    private boolean d;
    private int f;
    private int g;
    private final java.lang.String a = "video/mp2t";
    private final defpackage.etx b = new defpackage.etx(10);
    private long e = -9223372036854775807L;

    @Override // defpackage.ftx
    public final void a(defpackage.etx etxVar) {
        ahvr.ci(this.c);
        if (this.d) {
            int iD = etxVar.d();
            int i = this.g;
            if (i < 10) {
                int iMin = java.lang.Math.min(iD, 10 - i);
                byte[] bArr = etxVar.b;
                int i2 = etxVar.c;
                defpackage.etx etxVar2 = this.b;
                java.lang.System.arraycopy(bArr, i2, etxVar2.b, this.g, iMin);
                if (this.g + iMin == 10) {
                    etxVar2.Q(0);
                    if (etxVar2.n() != 73 || etxVar2.n() != 68 || etxVar2.n() != 51) {
                        defpackage.etr.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.d = false;
                        return;
                    } else {
                        etxVar2.R(3);
                        this.f = etxVar2.m() + 10;
                    }
                }
            }
            int iMin2 = java.lang.Math.min(iD, this.f - this.g);
            this.c.b(etxVar, iMin2);
            this.g += iMin2;
        }
    }

    @Override // defpackage.ftx
    public final void b(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        fvbVar.c();
        defpackage.fmk fmkVarR = fllVar.r(fvbVar.a(), 5);
        this.c = fmkVarR;
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.a = fvbVar.b();
        eqfVar.a(this.a);
        eqfVar.c("application/id3");
        fmkVarR.p(new defpackage.eqg(eqfVar));
    }

    @Override // defpackage.ftx
    public final void d() {
        int i;
        ahvr.ci(this.c);
        if (this.d && (i = this.f) != 0 && this.g == i) {
            ahvr.bY(this.e != -9223372036854775807L);
            this.c.d(this.e, 1, this.f, 0, null);
            this.d = false;
        }
    }

    @Override // defpackage.ftx
    public final void e(long j, int i) {
        if ((i & 4) != 0) {
            this.d = true;
            this.e = j;
            this.f = 0;
            this.g = 0;
        }
    }

    @Override // defpackage.ftx
    public final void f() {
        this.d = false;
        this.e = -9223372036854775807L;
    }

    @Override // defpackage.ftx
    public final /* synthetic */ void c() {
    }
}
