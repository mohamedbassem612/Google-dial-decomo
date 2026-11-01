package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ebp extends android.view.inputmethod.InputConnectionWrapper {
    final /* synthetic */ rai a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebp(android.view.inputmethod.InputConnection inputConnection, rai raiVar) {
        super(inputConnection, false);
        this.a = raiVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        defpackage.ni niVar = inputContentInfo == null ? null : new defpackage.ni(new defpackage.ebq(inputContentInfo));
        rai raiVar = this.a;
        if ((i & 1) != 0) {
            try {
                hq$.ExternalSyntheticApiModelOutline1.m(((defpackage.ebq) niVar.a).a);
                android.view.inputmethod.InputContentInfo inputContentInfo2 = ((defpackage.ebq) niVar.a).a;
                bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (java.lang.Exception e) {
                android.util.Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        java.lang.Object obj = raiVar.a;
        android.view.inputmethod.InputContentInfo inputContentInfo3 = ((defpackage.ebq) niVar.a).a;
        android.content.ClipData clipData = new android.content.ClipData(hq$.ExternalSyntheticApiModelOutline1.m(inputContentInfo3), new android.content.ClipData.Item(hq$.ExternalSyntheticApiModelOutline1.m(inputContentInfo3)));
        defpackage.dyg dyfVar = android.os.Build.VERSION.SDK_INT >= 31 ? new defpackage.dyf(clipData, 2) : new defpackage.dyh(clipData, 2);
        dyfVar.d(hq$.ExternalSyntheticApiModelOutline1.m$1(inputContentInfo3));
        dyfVar.b(bundle2);
        if (dzs.c((android.view.View) obj, dyfVar.a()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
