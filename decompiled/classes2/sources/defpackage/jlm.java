package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jlm {
    public static final aimz a = aimz.i("com/android/dialer/blockreportspam/ScamContextSelectorDialogFragmentPeer");
    public final defpackage.jlw b;
    public final defpackage.jlf c;
    public final agtj d;
    public final ahpz e;
    public final rlv f;
    public final defpackage.ahhb g;
    public final aoss h;
    public final agtk i;
    private final aoir j;

    public jlm(defpackage.jlw jlwVar, defpackage.jlf jlfVar, agtj agtjVar, ahpz ahpzVar, rlv rlvVar, defpackage.ahhb ahhbVar, aoss aossVar) {
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aossVar, "lightweightScope");
        this.b = jlwVar;
        this.c = jlfVar;
        this.d = agtjVar;
        this.e = ahpzVar;
        this.f = rlvVar;
        this.g = ahhbVar;
        this.h = aossVar;
        defpackage.jaj jajVar = new defpackage.jaj(this, 4);
        aoir aoirVarAh = aooc.ah(3, new defpackage.bmx(new defpackage.bmx(jlfVar, 7), 8));
        aopu[] aopuVarArr = aoou.a;
        this.j = defpackage.zb.k(jlfVar, new aooa(defpackage.jlq.class), new defpackage.bmx(aoirVarAh, 9), new defpackage.bmx(jajVar, 10), new defpackage.jll(jlfVar, aoirVarAh, 0));
        this.i = new defpackage.jlj(this);
    }

    public final defpackage.jlq a() {
        return (defpackage.jlq) this.j.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [al, jlf] */
    public final void b() {
        ?? r0 = this.c;
        com.google.android.material.chip.ChipGroup chipGroupM = ft$.ExternalSyntheticApiModelOutline0.m(r0.c(), 2131428865);
        aooh.e(chipGroupM, "requireViewById(...)");
        com.google.android.material.chip.ChipGroup chipGroup = chipGroupM;
        java.util.List<java.lang.Integer> listA = chipGroup.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listA, 10));
        for (java.lang.Integer num : listA) {
            aooh.c(num);
            arrayList.add(chipGroup.findViewById(num.intValue()).getText().toString());
        }
        java.lang.String string = ft$.ExternalSyntheticApiModelOutline0.m(r0.c(), 2131428978).getText().toString();
        defpackage.jlq jlqVarA = a();
        aooh.f(string, "customChipText");
        aozj aozjVar = jlqVarA.f;
        ((defpackage.jlp) aozjVar.c()).c.clear();
        ((defpackage.jlp) aozjVar.c()).c.addAll(arrayList);
        defpackage.jlp jlpVar = (defpackage.jlp) aozjVar.c();
        aooh.f(string, "<set-?>");
        jlpVar.d = string;
    }

    public final void c() {
        defpackage.jlw jlwVar = this.b;
        int i = (jlwVar.b & 2) != 0 ? jlwVar.d : 2132019885;
        defpackage.jlf jlfVar = this.c;
        defpackage.jjx jjxVar = jlwVar.c;
        if (jjxVar == null) {
            jjxVar = defpackage.jjx.a;
        }
        java.lang.String str = jjxVar.c;
        aooh.e(str, "getNormalizedNumber(...)");
        defpackage.hht.c(jlfVar, str, i);
    }
}
