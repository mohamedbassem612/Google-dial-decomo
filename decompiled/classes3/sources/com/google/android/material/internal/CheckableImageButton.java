package com.google.android.material.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class CheckableImageButton extends hr implements android.widget.Checkable {
    private static final int[] e = {android.R.attr.state_checked};
    public boolean a;
    public boolean b;
    public boolean c;
    public defpackage.aftz d;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckableImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.c = true;
        dzs.i(this, new defpackage.afty(this));
    }

    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    public final int[] onCreateDrawableState(int i) {
        return this.a ? mergeDrawableStates(super.onCreateDrawableState(i + 1), e) : super.onCreateDrawableState(i);
    }

    protected final void onDetachedFromWindow() {
        this.d = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.internal.CheckableImageButton.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.internal.CheckableImageButton.SavedState savedState = (com.google.android.material.internal.CheckableImageButton.SavedState) parcelable;
        super.onRestoreInstanceState(((androidx.customview.view.AbsSavedState) savedState).d);
        setChecked(savedState.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, com.google.android.material.internal.CheckableImageButton$SavedState] */
    protected final android.os.Parcelable onSaveInstanceState() {
        ?? savedState = new com.google.android.material.internal.CheckableImageButton.SavedState(super.onSaveInstanceState());
        savedState.a = this.a;
        return savedState;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.b || this.a == z) {
            return;
        }
        this.a = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public final void setFocusable(boolean z) {
        defpackage.aftz aftzVar;
        boolean zIsFocusable = isFocusable();
        super.setFocusable(z);
        if (zIsFocusable == z || (aftzVar = this.d) == null) {
            return;
        }
        aftzVar.a();
    }

    public final void setPressed(boolean z) {
        if (this.c) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.afqt(3);
        boolean a;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt() == 1;
        }

        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CheckableImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969573);
    }

    public CheckableImageButton(android.content.Context context) {
        this(context, null);
    }
}
