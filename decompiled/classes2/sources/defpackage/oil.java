package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class oil extends android.widget.FrameLayout implements amyq {
    private ahgs a;
    private boolean b;

    public oil(android.content.Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ahgs b() {
        ahgs ahgsVar = this.a;
        if (ahgsVar != null) {
            return ahgsVar;
        }
        ahgs ahgsVar2 = new ahgs(this);
        this.a = ahgsVar2;
        return ahgsVar2;
    }

    protected final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        defpackage.oik oikVar = (defpackage.oik) B();
        oikVar.I();
    }

    public oil(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public oil(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    oil(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
