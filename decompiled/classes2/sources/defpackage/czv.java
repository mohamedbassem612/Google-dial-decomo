package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class czv implements defpackage.czu {
    public final cze b;
    public final cze c;
    private final java.lang.String d;

    public czv(java.lang.String str) {
        this.d = str;
        this.b = new czf(str);
        this.c = new czf(str.concat(" maximum"));
    }

    @Override // defpackage.czu
    public final cze a() {
        return this.b;
    }

    @Override // defpackage.czu
    public final cze b() {
        return this.c;
    }

    public final java.lang.String toString() {
        return this.d;
    }
}
