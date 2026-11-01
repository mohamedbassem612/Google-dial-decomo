package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class weo extends android.widget.ScrollView implements amyq {
    private defpackage.ahgs a;
    private boolean b;

    public weo(android.content.Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.ahgs b() {
        defpackage.ahgs ahgsVar = this.a;
        if (ahgsVar != null) {
            return ahgsVar;
        }
        defpackage.ahgs ahgsVar2 = new defpackage.ahgs(this);
        this.a = ahgsVar2;
        return ahgsVar2;
    }

    protected final void d() {
        if (this.b) {
            return;
        }
        this.b = true;
        defpackage.wen wenVar = (defpackage.wen) B();
        wenVar.G();
    }

    public weo(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    public weo(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    weo(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        d();
    }
}
