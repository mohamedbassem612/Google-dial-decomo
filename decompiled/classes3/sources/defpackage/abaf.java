package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abaf extends aomh implements aonn {
    final /* synthetic */ aazd a;
    final /* synthetic */ defpackage.abai b;
    final /* synthetic */ abav c;
    final /* synthetic */ defpackage.abba d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abaf(aazd aazdVar, defpackage.abai abaiVar, abav abavVar, defpackage.abba abbaVar, aoln aolnVar) {
        super(2, aolnVar);
        this.a = aazdVar;
        this.b = abaiVar;
        this.c = abavVar;
        this.d = abbaVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abbe */
    public final java.lang.Object b(java.lang.Object obj) throws abbe {
        aooc.af(obj);
        aoss aossVar = (aoss) this.e;
        aimw aimwVarL = defpackage.abai.a.b().l("com/google/android/libraries/abuse/hades/moirai/MoiraiApi", "classify$<anonymous>", 229, "MoiraiApi.kt");
        aazd aazdVar = this.a;
        aimwVarL.y("Calling flatbuffer classify for client %s", aazdVar);
        defpackage.abai abaiVar = this.b;
        abav abavVarL = abaiVar.f.l(aazdVar);
        ahzh ahzhVarB = ahzh.b(ahzp.a);
        defpackage.abba abbaVar = this.d;
        try {
            defpackage.abbw abbwVar = abaiVar.c;
            if (abbwVar == null) {
                aooh.j("classifier");
                abbwVar = null;
            }
            defpackage.abbb abbbVarA = abbwVar.a(abbaVar, aossVar.c());
            abav abavVar = this.c;
            if (abavVar != null) {
                abavVar.a(this.a, abbbVarA.b, abbbVarA.c, abbbVarA);
            }
            return abbbVarA;
        } catch (abbe e) {
            if (abavVarL == null) {
                throw e;
            }
            abavVarL.b(aazdVar, e.c, e.d, ahzhVarB.a(java.util.concurrent.TimeUnit.MILLISECONDS), e.e, e.a, e.b);
            throw e;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.abaf abafVar = new defpackage.abaf(this.a, this.b, this.c, this.d, aolnVar);
        abafVar.e = obj;
        return abafVar;
    }
}
