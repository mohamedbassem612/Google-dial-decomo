package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class hq extends android.widget.EditText implements defpackage.dyz {
    private final defpackage.hi a;
    private final defpackage.ii b;
    private defpackage.cix c;
    private final defpackage.vx d;
    private rai e;

    public hq(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        defpackage.lo.d(this, getContext());
        defpackage.hi hiVar = new defpackage.hi(this);
        this.a = hiVar;
        hiVar.b(attributeSet, i);
        defpackage.ii iiVar = new defpackage.ii(this);
        this.b = iiVar;
        iiVar.c(attributeSet, i);
        iiVar.a();
        defpackage.vx vxVar = new defpackage.vx(this);
        this.d = vxVar;
        vxVar.h(attributeSet, i);
        android.text.method.KeyListener keyListener = getKeyListener();
        if (defpackage.vx.i(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            android.text.method.KeyListener keyListenerJ = defpackage.vx.j(keyListener);
            if (keyListenerJ != keyListener) {
                super.setKeyListener(keyListenerJ);
                super.setRawInputType(inputType);
                super.setFocusable(zIsFocusable);
                super.setClickable(zIsClickable);
                super.setLongClickable(zIsLongClickable);
            }
        }
    }

    private final rai d() {
        rai raiVar = this.e;
        if (raiVar != null) {
            return raiVar;
        }
        rai raiVar2 = new rai(this, (byte[]) null);
        this.e = raiVar2;
        return raiVar2;
    }

    @Override // defpackage.dyz
    public final dyl a(dyl dylVar) {
        return dzr.k(this, dylVar);
    }

    final defpackage.cix c() {
        defpackage.cix cixVar = this.c;
        if (cixVar != null) {
            return cixVar;
        }
        defpackage.cix cixVar2 = new defpackage.cix(this, new hp(this, 0));
        this.c = cixVar2;
        return cixVar2;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        defpackage.hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.a();
        }
        defpackage.ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        android.view.ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        defpackage.dzq.f(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public final java.lang.String getFontVariationSettings() {
        return (java.lang.String) c().a;
    }

    @Override // android.widget.TextView
    public final android.view.textclassifier.TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final android.graphics.Typeface getTypeface() {
        return (android.graphics.Typeface) c().c;
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        java.lang.String[] strArrM;
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        kj.m(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && android.os.Build.VERSION.SDK_INT <= 30 && (strArrM = defpackage.dzs.m(this)) != null) {
            hq$.ExternalSyntheticApiModelOutline1.m(editorInfo, strArrM);
            rai raiVar = new rai(this);
            defpackage.anty.aI(editorInfo, "editorInfo must be non-null");
            inputConnectionOnCreateInputConnection = new ebp(inputConnectionOnCreateInputConnection, raiVar);
        }
        return this.d.k(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (android.os.Build.VERSION.SDK_INT < 33) {
            ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(android.view.DragEvent dragEvent) {
        android.app.Activity activity;
        if (android.os.Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && defpackage.dzs.m(this) != null) {
            android.content.Context context = getContext();
            while (true) {
                if (!(context instanceof android.content.ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof android.app.Activity) {
                    activity = (android.app.Activity) context;
                    break;
                }
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
                android.util.Log.i("ReceiveContent", "Can't handle drop: no activity: view=".concat(toString()));
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                fh$.ExternalSyntheticApiModelOutline0.m(activity, dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    android.text.Selection.setSelection((android.text.Spannable) getText(), offsetForPosition);
                    android.content.ClipData clipData = dragEvent.getClipData();
                    defpackage.dzs.c(this, (android.os.Build.VERSION.SDK_INT >= 31 ? new dyf(clipData, 3) : new dyh(clipData, 3)).a());
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (android.os.Build.VERSION.SDK_INT < 31 && defpackage.dzs.m(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) getContext().getSystemService("clipboard");
            android.content.ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                return true;
            }
            dyf dyfVar = android.os.Build.VERSION.SDK_INT >= 31 ? new dyf(primaryClip, 1) : new dyh(primaryClip, 1);
            dyfVar.c(i == 16908322 ? 0 : 1);
            defpackage.dzs.c(this, dyfVar.a());
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        defpackage.hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        defpackage.hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        defpackage.ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        defpackage.ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.a();
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(java.lang.String str) {
        return c().e(str);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(defpackage.vx.j(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        defpackage.ii iiVar = this.b;
        if (iiVar != null) {
            iiVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface typeface) {
        c().d(typeface);
    }

    public hq(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969326);
    }

    public hq(android.content.Context context) {
        this(context, null);
    }
}
