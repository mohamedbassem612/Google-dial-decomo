package com.google.android.libraries.communications.ux.views.dialpad;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class DialpadKey extends android.widget.FrameLayout {
    public defpackage.abpo a;
    public defpackage.rai b;
    private final defpackage.abpu c;
    private int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialpadKey(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        aooh.f(context, "context");
        defpackage.abpu abpuVar = new defpackage.abpu(this);
        this.c = abpuVar;
        e(2131624091);
        abpuVar.c = true;
        abpuVar.a.setPadding(0, 0, 0, 0);
        abpuVar.a.setOutlineProvider(abpuVar.d);
        abpuVar.b(1.0f);
    }

    public final android.widget.ImageView a() {
        return (android.widget.ImageView) findViewById(2131427984);
    }

    public final android.widget.TextView b() {
        android.view.View viewFindViewById = findViewById(2131427986);
        aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.TextView) viewFindViewById;
    }

    public final android.widget.TextView c() {
        return (android.widget.TextView) findViewById(2131427987);
    }

    public final android.widget.TextView d() {
        return (android.widget.TextView) findViewById(2131427985);
    }

    public final void e(int i) {
        if (this.d != i) {
            removeAllViews();
            android.widget.FrameLayout.inflate(getContext(), i, this);
            this.d = i;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        java.lang.CharSequence charSequence;
        aooh.f(accessibilityNodeInfo, "info");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        defpackage.abpo abpoVar = this.a;
        if (abpoVar != null && (charSequence = abpoVar.e) != null) {
            accessibilityNodeInfo.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(32, charSequence));
        }
        da$.ExternalSyntheticApiModelOutline0.m(accessibilityNodeInfo, true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        aooh.f(motionEvent, "event");
        aooh.f(motionEvent, "event");
        defpackage.abpu abpuVar = this.c;
        if (abpuVar.c) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                abpuVar.a(0.5f);
            } else if (actionMasked == 1 || actionMasked == 3) {
                abpuVar.a(1.0f);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, android.os.Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(i, bundle);
        }
        if (isPressed()) {
            return true;
        }
        setPressed(true);
        sendAccessibilityEvent(1);
        setPressed(false);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, miq] */
    @Override // android.view.View
    public final void setPressed(boolean z) {
        super.setPressed(z);
        defpackage.rai raiVar = this.b;
        if (raiVar != null) {
            raiVar.a.a(this, z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialpadKey(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialpadKey(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialpadKey(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        aooh.f(context, "context");
    }

    public /* synthetic */ DialpadKey(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, aooc aoocVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
