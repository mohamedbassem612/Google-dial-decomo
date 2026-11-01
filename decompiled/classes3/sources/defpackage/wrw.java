package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class wrw extends android.widget.LinearLayout implements amyq {
    private defpackage.ahgs a;
    private boolean b;

    public wrw(android.content.Context context) {
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
    public final defpackage.ahgs b() {
        defpackage.ahgs ahgsVar = this.a;
        if (ahgsVar != null) {
            return ahgsVar;
        }
        defpackage.ahgs ahgsVar2 = new defpackage.ahgs(this);
        this.a = ahgsVar2;
        return ahgsVar2;
    }

    protected final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        defpackage.wse wseVar = (defpackage.wse) B();
        wseVar.V();
    }

    public wrw(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public wrw(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    wrw(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
