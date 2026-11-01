package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abzl implements anme {
    private static final defpackage.abzk a = new defpackage.abzk();
    private final defpackage.abzq b;

    private abzl(defpackage.abzq abzqVar) {
        this.b = abzqVar;
    }

    public static defpackage.abzl a(ahzi ahziVar) {
        return new defpackage.abzl(new defpackage.abzq(ahziVar));
    }

    public final ajsz b(anpk anpkVar, anmb anmbVar, anmc anmcVar) {
        defpackage.abzk abzkVar = a;
        anma anmaVar = anuj.c;
        java.util.Collection collection = (java.util.Collection) anmbVar.f(anmaVar);
        java.util.ArrayList arrayList = collection == null ? new java.util.ArrayList() : new java.util.ArrayList(collection);
        defpackage.abzq abzqVar = this.b;
        arrayList.add(abzkVar);
        return abzqVar.b(anpkVar, anmbVar.e(anmaVar, j$.util.DesugarCollections.unmodifiableList(arrayList)), anmcVar);
    }
}
