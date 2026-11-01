package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class wry extends android.support.v7.widget.Toolbar implements amyq {
    private defpackage.ahgs B;
    private boolean C;

    public wry(android.content.Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        F();
    }

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final defpackage.ahgs b() {
        defpackage.ahgs ahgsVar = this.B;
        if (ahgsVar != null) {
            return ahgsVar;
        }
        defpackage.ahgs ahgsVar2 = new defpackage.ahgs(this);
        this.B = ahgsVar2;
        return ahgsVar2;
    }

    protected final void F() {
        if (this.C) {
            return;
        }
        this.C = true;
        defpackage.wtu wtuVar = (defpackage.wtu) B();
        wtuVar.X();
    }

    public wry(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        F();
    }

    public wry(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        F();
    }
}
