package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eo implements android.text.method.TransformationMethod {
    private final java.util.Locale a;

    public eo(android.content.Context context) {
        this.a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public final java.lang.CharSequence getTransformation(java.lang.CharSequence charSequence, android.view.View view) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString().toUpperCase(this.a);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(android.view.View view, java.lang.CharSequence charSequence, boolean z, int i, android.graphics.Rect rect) {
    }
}
