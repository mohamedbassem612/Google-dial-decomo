package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alpm {
    private final aigf a;

    public alpm(aifo aifoVar, aifo aifoVar2) {
        this((aigf) j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(aifoVar).map(new defpackage.alki(19)), j$.util.Collection.-EL.stream(aifoVar2).map(new defpackage.alki(20))).collect(aigf.r()));
    }

    private final aihd d(defpackage.alpl alplVar) {
        return (aihd) j$.util.Collection.-EL.stream(this.a.e()).filter(new defpackage.alks(alplVar, 9)).map(new defpackage.alki(18)).collect(aido.b);
    }

    private static java.lang.String e(aihd aihdVar) {
        return (java.lang.String) j$.util.Collection.-EL.stream(aihdVar).map(new defpackage.alpp(1)).collect(j$.util.stream.Collectors.joining(","));
    }

    public final aihd a() {
        return d(defpackage.alpl.a);
    }

    public final aihd b() {
        return d(defpackage.alpl.b);
    }

    public final java.lang.String c() {
        return java.lang.String.format("Available features: %s. Downloadable features: %s.", e(a()), e(b()));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.alpm) && this.a.equals(((defpackage.alpm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public alpm(aigf aigfVar) {
        this.a = aigfVar;
    }
}
