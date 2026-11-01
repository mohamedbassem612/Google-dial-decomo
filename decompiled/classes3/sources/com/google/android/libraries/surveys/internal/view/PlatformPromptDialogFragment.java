package com.google.android.libraries.surveys.internal.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PlatformPromptDialogFragment extends android.app.DialogFragment implements defpackage.afkx {
    private final defpackage.afky a = new defpackage.afky(this);

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.a.k();
    }

    @Override // android.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return this.a.l(viewGroup);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        this.a.d();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.a.e(getView());
    }
}
