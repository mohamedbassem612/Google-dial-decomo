package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xsk extends android.content.ContextWrapper {
    static final defpackage.xsy a = new defpackage.xrq();
    public final java.util.List b;
    public final java.util.Map c;
    public final defpackage.xwq d;
    public final int e;
    public final defpackage.xxt f;
    public final xtq g;
    public final defpackage.xfh h;
    private final defpackage.yfw i;
    private defpackage.yep j;

    public xsk(android.content.Context context, defpackage.xxt xxtVar, defpackage.yfw yfwVar, defpackage.xfh xfhVar, java.util.Map map, java.util.List list, defpackage.xwq xwqVar, xtq xtqVar) {
        super(context.getApplicationContext());
        this.f = xxtVar;
        this.h = xfhVar;
        this.b = list;
        this.c = map;
        this.d = xwqVar;
        this.g = xtqVar;
        this.e = 4;
        this.i = new defpackage.yfv(yfwVar);
    }

    public final defpackage.xss a() {
        return (defpackage.xss) this.i.a();
    }

    public final synchronized defpackage.yep b() {
        defpackage.yep yepVar;
        yepVar = this.j;
        if (yepVar == null) {
            yepVar = new defpackage.yep();
            yepVar.Q();
            this.j = yepVar;
        }
        return yepVar;
    }
}
