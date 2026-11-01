package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiuu {
    final aify a;
    private final java.lang.String b;
    private final aify c;

    public aiuu(java.lang.String str, defpackage.aisz aiszVar) {
        this.b = str;
        aift aiftVar = new aift(4);
        aift aiftVar2 = new aift(4);
        defpackage.airh.b(new defpackage.aisy(aiszVar, defpackage.airh.b(new defpackage.aisx(aiszVar.a, str)).iterator(), str)).forEachOrdered(new defpackage.ffz(aiftVar, aiftVar2, 4));
        aike aikeVarH = aiftVar.h();
        this.a = aikeVarH;
        aike aikeVarH2 = aiftVar2.h();
        aify aifyVarB = aikeVarH2.b(0, aikeVarH2.d - 1);
        this.c = aifyVarB;
        int i = aikeVarH.d;
        j$.util.Collection.-EL.stream(aifyVarB).filter(new zun(8)).count();
    }

    private final int b() {
        return this.a.d - 1;
    }

    public final java.lang.String a(java.lang.Object obj, java.lang.Object obj2) {
        ahvr.bT(b() == 2, "format string expects %s placeholders, %s provided", b(), 2);
        aify aifyVar = this.a;
        return ((java.lang.String) aifyVar.get(0)) + obj.toString() + ((java.lang.String) aifyVar.get(1)) + obj2.toString() + ((java.lang.String) aifyVar.get(2));
    }

    public final java.lang.String toString() {
        return this.b;
    }
}
