package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class jxz extends android.widget.ViewAnimator implements amyq {
    private ahgs a;
    private boolean b;

    public jxz(android.content.Context context) {
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
    public final ahgs b() {
        ahgs ahgsVar = this.a;
        if (ahgsVar != null) {
            return ahgsVar;
        }
        ahgs ahgsVar2 = new ahgs(this);
        this.a = ahgsVar2;
        return ahgsVar2;
    }

    protected final void d() {
        if (this.b) {
            return;
        }
        this.b = true;
        defpackage.jxy jxyVar = (defpackage.jxy) B();
        jxyVar.K();
    }

    public jxz(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        d();
    }
}
