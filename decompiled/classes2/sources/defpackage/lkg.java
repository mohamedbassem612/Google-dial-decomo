package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lkg implements ajas {
    public final /* synthetic */ lkk a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.util.function.Consumer c;
    public final /* synthetic */ long d;

    public /* synthetic */ lkg(lkk lkkVar, java.lang.String str, java.util.function.Consumer consumer, long j) {
        this.a = lkkVar;
        this.b = str;
        this.c = consumer;
        this.d = j;
    }

    public final ajcq a() {
        lkk lkkVar = this.a;
        j$.util.Optional optional = lkkVar.b;
        optional.isPresent();
        final lkr lkrVar = (lkr) optional.orElseThrow();
        final java.lang.String str = this.b;
        ajcq ajcqVarD = lkrVar.d(str);
        final java.util.function.Consumer consumer = this.c;
        final long j = this.d;
        return ahvr.I(ajcqVarD, new ajat() { // from class: lkj
            public final ajcq a(java.lang.Object obj) {
                defpackage.lkq lkqVar = (defpackage.lkq) obj;
                boolean z = lkqVar == null;
                java.lang.String str2 = str;
                if (z) {
                    lkqVar = new defpackage.lkq();
                    lkqVar.a(str2);
                }
                lkr lkrVar2 = lkrVar;
                long j2 = j;
                aa$.ExternalSyntheticApiModelOutline1.m(consumer, lkqVar);
                ahvr.bY(str2.equals(lkqVar.a));
                lkqVar.f = j2;
                return z ? lkrVar2.f(lkqVar) : lkrVar2.g(lkqVar);
            }
        }, lkkVar.a);
    }
}
