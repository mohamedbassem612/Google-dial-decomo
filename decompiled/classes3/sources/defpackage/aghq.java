package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aghq extends android.text.style.ClickableSpan {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        defpackage.agho aghoVar;
        if (view instanceof defpackage.aghp) {
            ((defpackage.aghp) view).h();
        }
        java.lang.Object context = view.getContext();
        while (true) {
            if (!(context instanceof defpackage.agho)) {
                if (!(context instanceof android.content.ContextWrapper)) {
                    aghoVar = null;
                    break;
                }
                context = ((android.content.ContextWrapper) context).getBaseContext();
            } else {
                aghoVar = (defpackage.agho) context;
                break;
            }
        }
        if (aghoVar != null) {
            aghoVar.a();
            view.cancelPendingInputEvents();
        } else {
            android.util.Log.w("LinkSpan", "Dropping click event. No listener attached.");
        }
        if (view instanceof android.widget.TextView) {
            java.lang.CharSequence text = ((android.widget.TextView) view).getText();
            if (text instanceof android.text.Spannable) {
                android.text.Selection.setSelection((android.text.Spannable) text, 0);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
