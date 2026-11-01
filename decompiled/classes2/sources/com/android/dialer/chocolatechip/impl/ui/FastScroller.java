package com.android.dialer.chocolatechip.impl.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class FastScroller extends android.widget.RelativeLayout {
    public android.view.View a;
    public java.util.TreeMap b;
    private final int c;
    private defpackage.lom d;
    private android.support.v7.widget.LinearLayoutManager e;
    private android.widget.TextView f;
    private java.lang.String g;
    private boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastScroller(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        aooh.f(context, "context");
        aooh.f(attributeSet, "attrs");
        this.c = context.getResources().getDimensionPixelSize(2131165779);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    private final void c(float f) {
        float height;
        java.lang.String str;
        java.util.Map.Entry entryFloorEntry;
        defpackage.lom lomVar = this.d;
        if (lomVar != null) {
            int iA = lomVar.a();
            android.view.View view = this.a;
            if (view != null) {
                height = 0.0f;
                if (view.getY() != 0.0f) {
                    if (view.getY() + view.getHeight() >= getHeight()) {
                        height = 1.0f;
                    } else {
                        height = f / getHeight();
                    }
                }
            } else {
                height = f / getHeight();
            }
            int iW = aooc.w((int) (height * iA), 0, java.lang.Math.max(0, iA - 1));
            android.support.v7.widget.LinearLayoutManager linearLayoutManager = this.e;
            if (linearLayoutManager != null) {
                linearLayoutManager.au(iW);
            }
            java.util.TreeMap treeMap = this.b;
            if (treeMap == null || (entryFloorEntry = treeMap.floorEntry(java.lang.Integer.valueOf(iW))) == null || (str = (java.lang.String) entryFloorEntry.getValue()) == null) {
                str = "";
            }
            android.widget.TextView textView = this.f;
            if (textView != null) {
                textView.setText(str);
            }
            if (!android.text.TextUtils.isEmpty(str) && !aooh.n(str, this.g)) {
                performHapticFeedback(4);
            }
            this.g = str;
        }
    }

    public final void a(float f) {
        android.view.View view = this.a;
        if (view != null) {
            int height = view.getHeight();
            android.widget.TextView textView = this.f;
            if (textView != null) {
                int height2 = textView.getHeight();
                android.view.View view2 = this.a;
                if (view2 != null) {
                    view2.setY(aooc.u((int) aooc.q(f - (height / 2.0f), 0.0f), aooc.t(getHeight() - height, 0)));
                }
                android.widget.TextView textView2 = this.f;
                if (textView2 != null) {
                    textView2.setY(aooc.u((int) aooc.q(f - height2, 0.0f), aooc.t((getHeight() - height2) - (height / 2), 0)));
                }
            }
        }
    }

    public final void b(defpackage.lom lomVar, android.support.v7.widget.LinearLayoutManager linearLayoutManager) {
        this.d = lomVar;
        this.e = linearLayoutManager;
        setVisibility(0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (android.widget.TextView) findViewById(2131428241);
        android.view.View viewFindViewById = findViewById(2131428242);
        this.a = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(0, 0, 0, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.widget.TextView textView;
        android.view.View view;
        aooh.f(motionEvent, "event");
        if (!this.h) {
            if ((getWidth() - this.c) - motionEvent.getX() > 0.0f) {
                return super.onTouchEvent(motionEvent);
            }
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.h = true;
            android.widget.TextView textView2 = this.f;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.view.View view2 = this.a;
            if (view2 != null) {
                view2.setSelected(true);
            }
            a(motionEvent.getY());
            c(motionEvent.getY());
        } else if (action == 1) {
            this.h = false;
            textView = this.f;
            if (textView != null) {
                textView.setVisibility(4);
            }
            view = this.a;
            if (view != null) {
                view.setSelected(false);
            }
            performClick();
        } else if (action != 2) {
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
            this.h = false;
            textView = this.f;
            if (textView != null) {
                textView.setVisibility(4);
            }
            view = this.a;
            if (view != null) {
                view.setSelected(false);
            }
            performClick();
        } else {
            a(motionEvent.getY());
            c(motionEvent.getY());
        }
        return true;
    }
}
