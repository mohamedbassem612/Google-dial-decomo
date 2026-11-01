package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oml implements znk, znp {
    private final java.util.Set a;
    private final java.util.Set b;
    private final ajct c;

    public oml(java.util.Set set, java.util.Set set2, ajct ajctVar) {
        this.a = set;
        this.b = set2;
        this.c = ajctVar;
    }

    public final ajcq b() {
        return ahvr.aj((java.lang.Iterable) j$.util.Collection.-EL.stream(this.a).map(new defpackage.old(4)).collect(j$.util.stream.Collectors.toCollection(new defpackage.iaz(18)))).o(new defpackage.jse(18), this.c);
    }

    public final ajcq ek() {
        return ahvr.aj((java.lang.Iterable) j$.util.Collection.-EL.stream(this.b).map(new defpackage.old(5)).collect(j$.util.stream.Collectors.toCollection(new defpackage.iaz(18)))).o(new defpackage.jse(19), this.c);
    }
}
