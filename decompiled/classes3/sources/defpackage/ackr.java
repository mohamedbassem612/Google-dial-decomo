package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ackr {
    public defpackage.ackm a;
    public defpackage.ackm b;
    private final android.view.ViewTreeObserver.OnPreDrawListener c;
    private final android.view.View d;
    private java.lang.ref.WeakReference e;
    private defpackage.ackq f;
    private defpackage.ackq g;
    private boolean h;

    public ackr(android.view.View view) {
        ahvr.ci(view);
        this.d = view;
        this.f = new defpackage.ackq();
        this.g = new defpackage.ackq();
        this.c = new jvi(this, 2);
        this.h = false;
    }

    private final android.view.View c() {
        java.lang.ref.WeakReference weakReference = this.e;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00de A[SYNTHETIC] */
    public final void a() {
        android.graphics.Rect rect;
        android.view.View view;
        boolean z;
        android.view.View view2;
        int left;
        int top;
        android.graphics.Rect rect2;
        java.lang.Object tag;
        android.view.View viewC = c();
        if (viewC != null) {
            defpackage.ackq ackqVar = this.f;
            this.f = this.g;
            android.view.KeyEvent.Callback callback = this.d;
            ahvr.cj(ackqVar, "viewPosition cannot be null");
            ackqVar.a();
            if (callback instanceof android.view.ViewParent) {
                android.view.ViewParent viewParent = (android.view.ViewParent) callback;
                android.view.View view3 = viewC;
                while (true) {
                    if (view3 != null) {
                        if (view3 == viewParent) {
                            rect = ackqVar.a;
                            rect.set(0, 0, viewC.getWidth(), viewC.getHeight());
                            view = viewC;
                            z = false;
                            while (view != callback && view != null) {
                                view2 = (android.view.View) view.getParent();
                                left = (view.getLeft() + ((int) view.getTranslationX())) - view2.getScrollX();
                                top = (view.getTop() + ((int) view.getTranslationY())) - view2.getScrollY();
                                rect.offset(left, top);
                                if (z) {
                                    int width = view2.getWidth();
                                    int height = view2.getHeight();
                                    rect2 = ackqVar.b;
                                    rect2.left = java.lang.Math.max(rect2.left + left, 0);
                                    rect2.top = java.lang.Math.max(rect2.top + top, 0);
                                    rect2.right = java.lang.Math.min(rect2.right + left, width);
                                    rect2.bottom = java.lang.Math.min(rect2.bottom + top, height);
                                    tag = view2.getTag(2131428317);
                                    if (tag instanceof defpackage.ackp) {
                                        android.graphics.Rect rect3 = (android.graphics.Rect) ((defpackage.ackp) tag).eZ();
                                        rect2.left = java.lang.Math.max(rect2.left, rect3.left);
                                        rect2.top = java.lang.Math.max(rect2.top, rect3.top);
                                        rect2.right = java.lang.Math.min(rect2.right, rect3.right);
                                        rect2.bottom = java.lang.Math.min(rect2.bottom, rect3.bottom);
                                    }
                                }
                                z = true;
                                view = view2;
                            }
                        } else if (view3.getParent() instanceof android.view.View) {
                            java.lang.Object parent = view3.getParent();
                            if (parent instanceof android.view.View) {
                                view3 = (android.view.View) parent;
                            }
                        }
                    }
                }
            } else if (viewC == callback) {
                rect = ackqVar.a;
                rect.set(0, 0, viewC.getWidth(), viewC.getHeight());
                view = viewC;
                z = false;
                while (view != callback) {
                    view2 = (android.view.View) view.getParent();
                    left = (view.getLeft() + ((int) view.getTranslationX())) - view2.getScrollX();
                    top = (view.getTop() + ((int) view.getTranslationY())) - view2.getScrollY();
                    rect.offset(left, top);
                    if (z) {
                        int width2 = view2.getWidth();
                        int height2 = view2.getHeight();
                        rect2 = ackqVar.b;
                        rect2.left = java.lang.Math.max(rect2.left + left, 0);
                        rect2.top = java.lang.Math.max(rect2.top + top, 0);
                        rect2.right = java.lang.Math.min(rect2.right + left, width2);
                        rect2.bottom = java.lang.Math.min(rect2.bottom + top, height2);
                        tag = view2.getTag(2131428317);
                        if (tag instanceof defpackage.ackp) {
                            android.graphics.Rect rect4 = (android.graphics.Rect) ((defpackage.ackp) tag).eZ();
                            rect2.left = java.lang.Math.max(rect2.left, rect4.left);
                            rect2.top = java.lang.Math.max(rect2.top, rect4.top);
                            rect2.right = java.lang.Math.min(rect2.right, rect4.right);
                            rect2.bottom = java.lang.Math.min(rect2.bottom, rect4.bottom);
                        }
                    }
                    z = true;
                    view = view2;
                }
            }
            this.g = ackqVar;
            if (this.b != null) {
                defpackage.ackq ackqVar2 = this.f;
                boolean zB = ackqVar.b();
                boolean zB2 = ackqVar2.b();
                if (((zB || zB2) && !ackqVar.equals(ackqVar2)) || !viewC.isShown()) {
                    this.b.b(this.g);
                }
            }
        }
    }

    public final void b(android.view.View view) {
        if (view == c()) {
            a();
            return;
        }
        this.e = new java.lang.ref.WeakReference(view);
        defpackage.ackm ackmVar = this.a;
        if (ackmVar != null && view == null) {
            ackmVar.a();
        }
        android.view.ViewTreeObserver viewTreeObserver = this.d.getViewTreeObserver();
        if (view != null && !this.h && (!anfq.c() || viewTreeObserver.isAlive())) {
            viewTreeObserver.addOnPreDrawListener(this.c);
            this.h = true;
        }
        if (view == null && this.h) {
            if (!anfq.c() || viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.c);
            }
            this.h = false;
        }
        if (view != null) {
            a();
            return;
        }
        if (this.g.b()) {
            this.g.a();
            defpackage.ackm ackmVar2 = this.b;
            if (ackmVar2 != null) {
                ackmVar2.b(this.g);
            }
        }
    }
}
