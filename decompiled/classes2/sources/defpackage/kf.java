package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class kf {
    public final android.content.Context a;
    public final ft b;
    public final android.view.View c;
    public final defpackage.gc d;
    public android.view.View.OnTouchListener e;
    public rai f;
    public rai g;

    public kf(android.content.Context context, android.view.View view, int i, int i2, int i3) {
        this.a = context;
        this.c = view;
        ft ftVar = new ft(context);
        this.b = ftVar;
        ftVar.b = new defpackage.kc(this);
        defpackage.gc gcVar = new defpackage.gc(context, ftVar, view, false, i2, i3);
        this.d = gcVar;
        gcVar.b = i;
        gcVar.c = new defpackage.kd(this, 0);
    }

    public void a() {
        this.d.f();
    }
}
