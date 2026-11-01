package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahwa implements java.io.Serializable {
    public final defpackage.ahvu a;
    public final java.util.Map b;

    private ahwa(defpackage.ahvu ahvuVar, java.util.Map map) {
        this.a = ahvuVar;
        this.b = map;
    }

    static defpackage.ahwa a(defpackage.ahvu ahvuVar, java.util.Map map) {
        aigb aigbVar = new aigb(4);
        aigbVar.i("Authorization", aify.p("Bearer ".concat(java.lang.String.valueOf(ahvuVar.a))));
        aigbVar.l(map);
        return new defpackage.ahwa(ahvuVar, aigbVar.e(true));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ahwa)) {
            return false;
        }
        defpackage.ahwa ahwaVar = (defpackage.ahwa) obj;
        return j$.util.Objects.equals(this.b, ahwaVar.b) && j$.util.Objects.equals(this.a, ahwaVar.a);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }
}
