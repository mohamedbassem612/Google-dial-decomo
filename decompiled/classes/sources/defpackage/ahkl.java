package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahkl {
    public java.lang.String a;
    public defpackage.ahkk b;
    public j$.util.Optional c;
    public byte d;
    private defpackage.aift e;
    private defpackage.aify f;
    private defpackage.albh g;
    private j$.util.Optional h;

    public ahkl(byte[] bArr) {
        this.c = j$.util.Optional.empty();
        this.h = j$.util.Optional.empty();
    }

    public final defpackage.ahkm a() {
        java.lang.String str;
        defpackage.albh albhVar;
        defpackage.ahkk ahkkVar;
        defpackage.aift aiftVar = this.e;
        if (aiftVar != null) {
            this.f = aiftVar.g();
        } else if (this.f == null) {
            this.f = defpackage.aike.a;
        }
        if (this.d == 1 && (str = this.a) != null && (albhVar = this.g) != null && (ahkkVar = this.b) != null) {
            return new defpackage.ahkm(str, this.f, albhVar, ahkkVar, this.c, this.h);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.g == null) {
            sb.append(" schema");
        }
        if (this.b == null) {
            sb.append(" storage");
        }
        if (this.d == 0) {
            sb.append(" enableTracing");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(defpackage.ecs ecsVar) {
        defpackage.aift aiftVar = this.e;
        if (aiftVar == null) {
            aiftVar = new defpackage.aift(4);
            this.e = aiftVar;
        }
        aiftVar.i(ecsVar);
    }

    public final void c(defpackage.albh albhVar) {
        if (albhVar == null) {
            throw new java.lang.NullPointerException("Null schema");
        }
        this.g = albhVar;
    }

    public ahkl() {
        throw null;
    }
}
