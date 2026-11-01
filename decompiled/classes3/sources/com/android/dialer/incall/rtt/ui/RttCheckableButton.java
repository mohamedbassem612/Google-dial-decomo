package com.android.dialer.incall.rtt.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class RttCheckableButton extends hj implements android.widget.Checkable {
    private static final int[] c = {android.R.attr.state_checked};
    public defpackage.qhv b;
    private boolean d;
    private boolean e;
    private java.lang.CharSequence f;
    private java.lang.CharSequence g;
    private java.lang.CharSequence h;
    private java.lang.CharSequence i;

    public RttCheckableButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.qgv.b);
        c(typedArrayObtainStyledAttributes.getBoolean(0, false));
        this.f = typedArrayObtainStyledAttributes.getText(1);
        this.g = typedArrayObtainStyledAttributes.getText(2);
        this.h = typedArrayObtainStyledAttributes.getText(3);
        java.lang.CharSequence text = typedArrayObtainStyledAttributes.getText(4);
        this.i = text;
        if (text == null) {
            this.i = getText();
        }
        typedArrayObtainStyledAttributes.recycle();
        d();
        e();
        setClickable(true);
        setFocusable(true);
    }

    private final void e() {
        if (this.e) {
            java.lang.CharSequence charSequence = this.h;
            if (charSequence != null) {
                setText(charSequence);
                return;
            }
            return;
        }
        java.lang.CharSequence charSequence2 = this.i;
        if (charSequence2 != null) {
            setText(charSequence2);
        }
    }

    public final void c(boolean z) {
        if (this.e != z) {
            this.e = z;
            d();
            e();
            refreshDrawableState();
        }
    }

    public final void d() {
        setContentDescription(this.e ? this.f : this.g);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.e;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.e) {
            mergeDrawableStates(iArrOnCreateDrawableState, c);
        }
        return iArrOnCreateDrawableState;
    }

    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        com.android.dialer.incall.rtt.ui.RttCheckableButton.SavedState savedState = (com.android.dialer.incall.rtt.ui.RttCheckableButton.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        c(savedState.a);
        requestLayout();
    }

    public final android.os.Parcelable onSaveInstanceState() {
        return new com.android.dialer.incall.rtt.ui.RttCheckableButton.SavedState(this.e, super.onSaveInstanceState());
    }

    public final boolean performClick() {
        if (this.b == null) {
            return super.performClick();
        }
        toggle();
        boolean zPerformClick = super.performClick();
        if (zPerformClick) {
            return zPerformClick;
        }
        playSoundEffect(0);
        return zPerformClick;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        c(z);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        boolean z = this.e;
        if (z == (!z) || this.d) {
            return;
        }
        this.d = true;
        defpackage.qhv qhvVar = this.b;
        if (qhvVar != null) {
            if (this == qhvVar.c) {
                j$.util.Optional optionalF = qhvVar.a.y().f();
                if (true == optionalF.isPresent()) {
                    defpackage.qfj qfjVar = (defpackage.qfj) optionalF.get();
                    defpackage.qfj.a.b().l("com/android/dialer/incall/rtt/service/RttChatController", "onMuteClicked", 173, "RttChatController.java").v("onMuteClicked");
                    qfjVar.g.c(!qfjVar.f.g(), true);
                }
            } else if (this == qhvVar.d) {
                j$.util.Optional optionalF2 = qhvVar.a.y().f();
                if (true == optionalF2.isPresent()) {
                    defpackage.qfj qfjVar2 = (defpackage.qfj) optionalF2.get();
                    defpackage.qfj.a.b().l("com/android/dialer/incall/rtt/service/RttChatController", "onToggleSpeakerPhoneClicked", 190, "RttChatController.java").v("onToggleSpeakerPhoneClicked");
                    agsm agsmVar = qfjVar2.i;
                    ajcq ajcqVarX = qfjVar2.q.X();
                    defpackage.qgk qgkVar = new defpackage.qgk(1);
                    ajct ajctVar = qfjVar2.c;
                    ajcq ajcqVarH = ahvr.H(ahvr.I(ajcqVarX, qgkVar, ajctVar), new defpackage.qgx(qfjVar2, 1), ajctVar);
                    defpackage.qfj.b.longValue();
                    agsmVar.g(ajcqVarH, 5L, java.util.concurrent.TimeUnit.SECONDS);
                }
            } else if (this == qhvVar.e) {
                qhvVar.dismiss();
                j$.util.Optional optionalF3 = qhvVar.a.y().f();
                if (true == optionalF3.isPresent()) {
                    defpackage.qfj qfjVar3 = (defpackage.qfj) optionalF3.get();
                    defpackage.qfj.a.b().l("com/android/dialer/incall/rtt/service/RttChatController", "onDialpadButtonClicked", 178, "RttChatController.java").v("onDialpadButtonClicked");
                    qfjVar3.k = !qfjVar3.k;
                    qfjVar3.o.a(ajcm.a);
                }
            } else if (this == qhvVar.g) {
                if (qhvVar.l) {
                    if (z) {
                        j$.util.Optional optionalF4 = qhvVar.a.y().f();
                        if (true == optionalF4.isPresent()) {
                            defpackage.qfj qfjVar4 = (defpackage.qfj) optionalF4.get();
                            defpackage.qfj.a.b().l("com/android/dialer/incall/rtt/service/RttChatController", "onUnholdCallClicked", 167, "RttChatController.java").v("onUnholdCallClicked");
                            qfjVar4.c();
                            agsm.i(603, qfjVar4.m.l(), "failed to unhold the call", new java.lang.Object[0]);
                        }
                    } else {
                        j$.util.Optional optionalF5 = qhvVar.a.y().f();
                        if (true == optionalF5.isPresent()) {
                            defpackage.qfj qfjVar5 = (defpackage.qfj) optionalF5.get();
                            defpackage.qfj.a.b().l("com/android/dialer/incall/rtt/service/RttChatController", "onHoldCallClicked", 161, "RttChatController.java").v("onHoldCallClicked");
                            qfjVar5.d();
                            qfjVar5.m.n();
                        }
                    }
                }
            } else if (this == qhvVar.i) {
                defpackage.qhj qhjVarY = qhvVar.a.y();
                if (qhjVarY.A) {
                    defpackage.qhj.a.b().l("com/android/dialer/incall/rtt/ui/RttChatFragmentPeer", "onMergeConfirmationClicked", 932, "RttChatFragmentPeer.java").v("Showing merge confirmation dialog");
                    defpackage.qho qhoVar = new defpackage.qho();
                    amxr.g(qhoVar);
                    qhoVar.r(qhjVarY.l.I(), "tag_merge_confirm_dialog_fragment");
                } else {
                    j$.util.Optional optionalF6 = qhjVarY.f();
                    if (true == optionalF6.isPresent()) {
                        ((defpackage.qfj) optionalF6.get()).b();
                    }
                }
            }
        }
        this.d = false;
    }

    /* JADX INFO: compiled from: PG */
    public final class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new gec(9);
        public final boolean a;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }

        public SavedState(boolean z, android.os.Parcelable parcelable) {
            super(parcelable);
            this.a = z;
        }
    }

    public RttCheckableButton(android.content.Context context) {
        this(context, null);
    }
}
