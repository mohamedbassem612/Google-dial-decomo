package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aham extends ld {
    public final android.view.View s;

    public aham(android.view.View view, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(view);
        this.s = (android.widget.TextView) view.findViewById(2131427664);
    }

    public final void C(int i) {
        ((android.widget.TextView) this.s).setText(i);
    }

    public aham(android.view.View view, char[] cArr, byte[] bArr) {
        super(view);
        this.s = (com.android.dialer.callscreen.impl.ui.SuggestionsView) view.findViewById(2131429149);
    }

    public aham(android.view.View view, byte[] bArr, byte[] bArr2) {
        super(view);
        this.s = (android.widget.TextView) view.findViewById(2131428453);
    }

    public aham(android.view.View view, char[] cArr) {
        super(view);
        this.s = view;
    }

    public aham(android.view.View view, byte[] bArr) {
        super(view);
        this.s = view;
    }

    public aham(android.view.View view) {
        super(view);
        this.s = view;
    }
}
