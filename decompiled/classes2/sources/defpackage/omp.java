package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class omp implements znt, znv {
    private final java.util.Set a;
    private final java.util.Set b;
    private final ajct c;

    public omp(java.util.Set set, java.util.Set set2, ajct ajctVar) {
        this.a = set;
        this.b = set2;
        this.c = ajctVar;
    }

    public final ajcq b() {
        return ahvr.aj((java.lang.Iterable) j$.util.Collection.-EL.stream(this.a).map(new defpackage.old(7)).collect(j$.util.stream.Collectors.toCollection(new defpackage.iaz(19)))).o(new defpackage.onq(1), this.c);
    }

    public final ajcq ej() {
        return ahvr.aj((java.lang.Iterable) j$.util.Collection.-EL.stream(this.b).map(new defpackage.old(6)).collect(j$.util.stream.Collectors.toCollection(new defpackage.iaz(19)))).o(new defpackage.jse(20), this.c);
    }
}
