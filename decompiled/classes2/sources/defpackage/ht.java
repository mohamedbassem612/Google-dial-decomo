package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ht extends android.widget.PopupWindow {
    public ht(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ajxw ajxwVarD = ajxw.D(context, attributeSet, ef.t, i, i2);
        if (ajxwVarD.z(2)) {
            setOverlapAnchor(ajxwVarD.y(2, false));
        }
        setBackgroundDrawable(ajxwVarD.t(0));
        ajxwVarD.x();
    }
}
