package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class amxj implements defpackage.amyp {
    protected final android.app.Activity a;
    private volatile java.lang.Object b;
    private final java.lang.Object c = new java.lang.Object();
    private final defpackage.amyp d;
    private defpackage.amxw e;
    private final defpackage.amxy f;
    private final defpackage.amyp g;
    private defpackage.amxw h;

    public amxj(android.app.Activity activity, defpackage.amyp amypVar, defpackage.amyp amypVar2, defpackage.amxy amxyVar) {
        this.a = activity;
        this.d = amypVar;
        this.g = amypVar2;
        this.f = amxyVar;
    }

    @Override // defpackage.amyp
    public final java.lang.Object B() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = a();
                }
            }
        }
        return this.b;
    }

    protected java.lang.Object a() {
        android.app.Activity activity = this.a;
        if (!(activity.getApplication() instanceof defpackage.amyp)) {
            throw new java.lang.IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(android.app.Application.class.equals(activity.getApplication().getClass()) ? "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?" : "Found: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(activity.getApplication().getClass())))));
        }
        defpackage.ajxw ajxwVarJ = ((defpackage.amxi) defpackage.aooc.ar(this.d, defpackage.amxi.class)).j();
        ajxwVarJ.c = activity;
        return new defpackage.hkg((him) ajxwVarJ.b, (defpackage.hkh) ajxwVarJ.a, (android.app.Activity) ajxwVarJ.c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [amwx, java.lang.Object] */
    public final defpackage.amwx b() {
        return this.d.B();
    }

    public final defpackage.amwz c() {
        return (defpackage.amwz) this.g.B();
    }

    public final void d() {
        defpackage.amxw amxwVar = this.e;
        if (amxwVar != null) {
            amxwVar.a();
        }
        defpackage.amxw amxwVar2 = this.h;
        if (amxwVar2 != null) {
            amxwVar2.a();
        }
    }

    public final void e() {
        defpackage.amxo amxoVar = (defpackage.amxo) this.d;
        defpackage.amxw amxwVar = ((defpackage.amxm) amxoVar.a(amxoVar.a, amxoVar.b).a(defpackage.amxm.class)).b;
        this.e = amxwVar;
        if (amxwVar.c()) {
            this.e.b(((defpackage.mp) this.a).T());
        }
        defpackage.amyc amycVar = (defpackage.amyc) this.g;
        defpackage.amxw amxwVar2 = ((defpackage.amya) new defpackage.eog(amycVar.a, new defpackage.amxk(amycVar.b, 3)).a(defpackage.amya.class)).b;
        this.h = amxwVar2;
        if (amxwVar2.c()) {
            this.h.b(((defpackage.mp) this.a).T());
        }
    }

    public final defpackage.hko f() {
        return this.f.B();
    }
}
