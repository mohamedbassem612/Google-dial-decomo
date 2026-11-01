package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ekh implements android.text.method.KeyListener {
    private final android.text.method.KeyListener a;

    public ekh(android.text.method.KeyListener keyListener) {
        this.a = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(android.view.View view, android.text.Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(android.view.View view, android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        boolean zQ;
        if (i != 67) {
            if (i == 112) {
                zQ = defpackage.zb.q(editable, keyEvent, true);
            }
            if (this.a.onKeyDown(view, editable, i, keyEvent)) {
                return true;
            }
            return false;
        }
        zQ = defpackage.zb.q(editable, keyEvent, false);
        if (zQ) {
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        if (this.a.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(android.view.View view, android.text.Editable editable, android.view.KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(android.view.View view, android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}
