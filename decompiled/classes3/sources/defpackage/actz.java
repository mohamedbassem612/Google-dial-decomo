package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class actz extends dmc {
    public final defpackage.actv c;
    public final dnd d;
    public final int e;
    public final defpackage.actx f;
    public final defpackage.actw g;
    public final java.lang.String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public actz(defpackage.actv actvVar, dnd dndVar, defpackage.actx actxVar, defpackage.actw actwVar) {
        super(2, defpackage.acuc.a, actxVar.a);
        aooh.f(dndVar, "weight");
        this.c = actvVar;
        this.d = dndVar;
        this.e = 0;
        this.f = actxVar;
        this.g = actwVar;
        this.h = "name=Google Sans&weight=" + actwVar.a.h + "&italic=" + (a.x(0, 1) ? 1 : 0);
    }

    public final dnd b() {
        return this.d;
    }

    public final void c() {
    }
}
