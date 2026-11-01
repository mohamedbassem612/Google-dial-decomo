package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class jux extends yew {
    final /* synthetic */ com.android.dialer.calleridfeedback.impl.ui.callertagselector.CallerTagChipView a;
    final /* synthetic */ defpackage.juz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jux(defpackage.juz juzVar, com.google.android.material.chip.Chip chip, com.android.dialer.calleridfeedback.impl.ui.callertagselector.CallerTagChipView callerTagChipView) {
        super(chip);
        this.a = callerTagChipView;
        j$.util.Objects.requireNonNull(juzVar);
        this.b = juzVar;
    }

    public final void a(android.graphics.drawable.Drawable drawable) {
        defpackage.juz.a.d().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/calleridfeedback/impl/ui/callertagselector/CallerTagChipViewPeer$1", "onLoadFailed", 62, "CallerTagChipViewPeer.java").y("failed to load icon from URL for tag: %s", this.b.g);
        this.a.j(drawable);
    }

    protected final void b(android.graphics.drawable.Drawable drawable) {
        this.a.j(drawable);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, yfi yfiVar) {
        com.android.dialer.calleridfeedback.impl.ui.callertagselector.CallerTagChipView callerTagChipView = this.a;
        callerTagChipView.j(new android.graphics.drawable.BitmapDrawable(callerTagChipView.getContext().getResources(), (android.graphics.Bitmap) obj));
    }
}
