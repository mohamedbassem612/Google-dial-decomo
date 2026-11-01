package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agro {
    public static final aimz a = aimz.i("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer");
    public final agtk b = new defpackage.agrj(this);
    public final agtk c = new defpackage.agrk(this);
    public final agye d = new defpackage.agrn(this);
    public final az e;
    public final defpackage.agrh f;
    public final agtj g;
    public final ahpz h;
    public final defpackage.agqv i;
    public final ahyn j;
    public final defpackage.aekm k;
    public final defpackage.aekn l;
    public final java.util.concurrent.Executor m;
    public ahyn n;
    public defpackage.agon o;
    public final ajwr p;
    public final adag q;
    public final xtq r;
    public final defpackage.uzx s;
    private final agov t;

    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public agro(android.content.Context context, az azVar, defpackage.agrh agrhVar, ahyn ahynVar, ajwr ajwrVar, agtj agtjVar, ahpz ahpzVar, adag adagVar, agov agovVar, ucm ucmVar, java.util.Map map, xtq xtqVar, ahhp ahhpVar, defpackage.zoe zoeVar, defpackage.uzx uzxVar, defpackage.acov acovVar, java.util.concurrent.Executor executor, ajct ajctVar) {
        ahwt ahwtVar = ahwt.a;
        this.n = ahwtVar;
        this.e = azVar;
        this.f = agrhVar;
        this.p = ajwrVar;
        this.g = agtjVar;
        this.h = ahpzVar;
        this.q = adagVar;
        this.t = agovVar;
        this.r = xtqVar;
        this.s = uzxVar;
        this.m = executor;
        defpackage.aekl aeklVarA = defpackage.aekm.a(context);
        java.lang.Class cls = null;
        defpackage.aliq aliqVar = new defpackage.aliq((byte[]) null);
        aliqVar.a = new defpackage.agrb(ahynVar);
        aliqVar.b = defpackage.agwm.g(ahhpVar, agrhVar, new defpackage.agrb(ahynVar));
        aliqVar.m(new defpackage.ahpp(ahpzVar, 1312, "Click Add Accounts in TikTok Express SignIn", (android.view.View.OnClickListener) new mar(this, ahynVar, zoeVar, agtjVar, 5), 0));
        aeklVarA.c = aliqVar.l();
        aeklVarA.d(ajctVar);
        aeklVarA.e(acovVar);
        defpackage.aekm aekmVarA = aeklVarA.a();
        this.k = aekmVarA;
        this.l = new defpackage.aekn(aekmVarA);
        android.content.Intent intent = azVar.getIntent();
        if (intent.getBooleanExtra("$tiktok$eligibility_intents$mapper_class_owned", false)) {
            java.io.Serializable serializableExtra = intent.getSerializableExtra("$tiktok$eligibility_intents$mapper_class");
            ahvr.ci(serializableExtra);
            cls = (java.lang.Class) serializableExtra;
        }
        if (cls == null) {
            this.i = new defpackage.agqv((apjb) ucmVar.a, ahwtVar, ucmVar.b);
            this.j = ahwtVar;
            return;
        }
        ahvr.cc(ucmVar.c.containsKey(cls), "EligibilityMapper not found for %s", cls);
        defpackage.agqx agqxVar = (defpackage.agqx) ((aoin) ucmVar.c.get(cls)).a();
        this.i = new defpackage.agqv((apjb) ucmVar.a, ahyn.h(agqxVar), ucmVar.b);
        ahvr.cc(map.containsKey(cls), "AccountIneligibleDialogCreator not provided for mapperClass: %s", cls);
        this.j = ahyn.h((defpackage.agrg) ((aoin) map.get(cls)).a());
    }

    public final void a() {
        agsm.i(1313, this.t.a(), "Failed account invalidation.", new java.lang.Object[0]);
    }
}
