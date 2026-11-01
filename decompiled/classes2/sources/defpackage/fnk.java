package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fnk implements defpackage.flj {
    private final /* synthetic */ int $cid;
    private final defpackage.flj a;
    private final defpackage.flj b;
    private defpackage.fll c;
    private defpackage.flj d;
    private android.util.Pair e;

    public fnk(int i, int i2) {
        this.$cid = i2;
        this.a = new defpackage.fmc(65496, 2, "image/jpeg");
        this.b = i == 0 ? new defpackage.fnl() : null;
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return this.$cid != 0 ? aike.a : aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        int i = this.$cid;
        this.c = fllVar;
        if (i != 0) {
            if (this.b == null) {
                defpackage.flj fljVar = this.a;
                this.d = fljVar;
                fljVar.b(fllVar);
                return;
            }
            return;
        }
        if (this.b == null) {
            defpackage.flj fljVar2 = this.a;
            this.d = fljVar2;
            fljVar2.b(fllVar);
        }
    }

    @Override // defpackage.flj
    public final void c() {
        defpackage.flj fljVar;
        if (this.$cid == 0 || (fljVar = this.b) == null) {
            return;
        }
        fljVar.c();
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        int i = this.$cid;
        defpackage.flj fljVar = this.d;
        if (i != 0) {
            if (fljVar != null) {
                fljVar.d(j, j2);
                return;
            } else {
                this.e = android.util.Pair.create(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2));
                return;
            }
        }
        if (fljVar != null) {
            fljVar.d(j, j2);
        } else {
            this.e = android.util.Pair.create(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2));
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        int i = this.$cid;
        defpackage.flj fljVar = this.b;
        if (i != 0) {
            if (fljVar != null && defpackage.hgu.ag(flkVar, true)) {
                return true;
            }
            flkVar.k();
            return defpackage.hgu.ag(flkVar, false);
        }
        if (fljVar != null && fljVar.e(flkVar)) {
            return true;
        }
        flkVar.k();
        return this.a.e(flkVar);
    }

    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) {
        int i = this.$cid;
        defpackage.flj fljVar = this.d;
        if (i != 0) {
            if (fljVar == null) {
                defpackage.flj fljVar2 = this.b;
                ahvr.ci(fljVar2);
                if (!defpackage.hgu.ag(flkVar, true)) {
                    fljVar2 = this.a;
                }
                this.d = fljVar2;
                flkVar.k();
                android.util.Pair pair = this.e;
                if (pair != null) {
                    this.d.d(((java.lang.Long) pair.first).longValue(), ((java.lang.Long) this.e.second).longValue());
                    this.e = null;
                }
                defpackage.flj fljVar3 = this.d;
                defpackage.fll fllVar = this.c;
                ahvr.ci(fllVar);
                fljVar3.b(fllVar);
            }
            return this.d.g(flkVar, aesqVar);
        }
        if (fljVar == null) {
            defpackage.flj fljVar4 = this.b;
            ahvr.ci(fljVar4);
            if (!fljVar4.e(flkVar)) {
                fljVar4 = this.a;
            }
            this.d = fljVar4;
            flkVar.k();
            android.util.Pair pair2 = this.e;
            if (pair2 != null) {
                this.d.d(((java.lang.Long) pair2.first).longValue(), ((java.lang.Long) this.e.second).longValue());
                this.e = null;
            }
            defpackage.flj fljVar5 = this.d;
            defpackage.fll fllVar2 = this.c;
            ahvr.ci(fllVar2);
            fljVar5.b(fllVar2);
        }
        return this.d.g(flkVar, aesqVar);
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }

    public fnk(int i, int i2, byte[] bArr) {
        this.$cid = i2;
        this.a = new defpackage.fmc(-1, -1, "image/heif");
        this.b = i != 0 ? null : new defpackage.fnj();
    }
}
