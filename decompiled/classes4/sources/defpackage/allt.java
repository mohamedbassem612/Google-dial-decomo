package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class allt implements java.util.function.Consumer {
    public final /* synthetic */ defpackage.allu a;
    public final /* synthetic */ defpackage.alsz b;
    public final /* synthetic */ defpackage.alsy c;
    public final /* synthetic */ defpackage.almy d;
    public final /* synthetic */ java.util.function.BiConsumer e;
    public final /* synthetic */ defpackage.almm f;

    public /* synthetic */ allt(defpackage.allu alluVar, defpackage.alsz alszVar, defpackage.alsy alsyVar, defpackage.almy almyVar, java.util.function.BiConsumer biConsumer, defpackage.almm almmVar) {
        this.a = alluVar;
        this.b = alszVar;
        this.c = alsyVar;
        this.d = almyVar;
        this.e = biConsumer;
        this.f = almmVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        defpackage.alsn alsnVar = (defpackage.alsn) obj;
        defpackage.alsm alsmVar = alsnVar.d;
        if (alsmVar == null) {
            alsmVar = defpackage.alsm.a;
        }
        java.util.function.BiConsumer biConsumer = this.e;
        defpackage.almy almyVar = this.d;
        defpackage.alsy alsyVar = this.c;
        defpackage.alsz alszVar = this.b;
        defpackage.allu alluVar = this.a;
        java.lang.String str = alsmVar.c;
        alln allnVar = (alln) alluVar.f.b;
        if (!allnVar.f(java.lang.String.valueOf(str).concat(".wav")) && !allnVar.f(java.lang.String.valueOf(str).concat(".ogg"))) {
            defpackage.allu.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/Speaker", "maybeSayBotIntentsWithActionWithFallback", 129, "Speaker.java").I("Audio file missing for intent %s: %s (.wav or .ogg). Falling back to TTS.", this.f.c, str);
            akzx akzxVarM = defpackage.alnh.a.m();
            defpackage.alsm alsmVar2 = alsnVar.d;
            if (alsmVar2 == null) {
                alsmVar2 = defpackage.alsm.a;
            }
            java.lang.String str2 = alsmVar2.d;
            akzxVarM.u();
            defpackage.alnh alnhVar = (defpackage.alnh) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            alnhVar.b |= 1;
            alnhVar.c = str2;
            akzxVarM.u();
            defpackage.alnh alnhVar2 = (defpackage.alnh) akzxVarM.b;
            alnhVar2.d = alsyVar.j;
            alnhVar2.b |= 2;
            alluVar.d((defpackage.alnh) akzxVarM.p(), almyVar, biConsumer, alszVar);
            return;
        }
        akzx akzxVarM2 = defpackage.alol.a.m();
        akzxVarM2.u();
        defpackage.alol alolVar = (defpackage.alol) akzxVarM2.b;
        alolVar.d = alszVar.d;
        alolVar.b |= 2;
        akzxVarM2.u();
        defpackage.alol alolVar2 = (defpackage.alol) akzxVarM2.b;
        alolVar2.c = alsyVar.j;
        alolVar2.b |= 1;
        akzx akzxVarM3 = defpackage.alsw.a.m();
        akzxVarM3.u();
        defpackage.alsw alswVar = (defpackage.alsw) akzxVarM3.b;
        j$.util.Objects.requireNonNull(alsnVar);
        alswVar.c = alsnVar;
        alswVar.b = 1;
        akzxVarM2.u();
        defpackage.alol alolVar3 = (defpackage.alol) akzxVarM2.b;
        defpackage.alsw alswVar2 = (defpackage.alsw) akzxVarM3.p();
        j$.util.Objects.requireNonNull(alswVar2);
        alolVar3.e = alswVar2;
        alolVar3.b |= 4;
        alluVar.e.h(new defpackage.alka(defpackage.allu.a((defpackage.alol) akzxVarM2.p()), almyVar, biConsumer));
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
