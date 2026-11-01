package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cy extends defpackage.ds implements android.content.DialogInterface {
    public final defpackage.cw a;

    protected cy(android.content.Context context, int i) {
        super(context, a(context, i));
        this.a = new defpackage.cw(getContext(), this, getWindow());
    }

    static int a(android.content.Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(2130968629, typedValue, true);
        return typedValue.resourceId;
    }

    public final android.widget.Button b(int i) {
        defpackage.cw cwVar = this.a;
        if (i == -3) {
            return cwVar.p;
        }
        if (i == -2) {
            return cwVar.m;
        }
        if (i != -1) {
            return null;
        }
        return cwVar.j;
    }

    public final android.widget.ListView d() {
        return this.a.f;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x01b2  */
    @Override // defpackage.ds, defpackage.mr, android.app.Dialog
    protected final void onCreate(android.os.Bundle bundle) {
        int i;
        android.view.View viewFindViewById;
        android.widget.ListAdapter listAdapter;
        int i2;
        android.view.View viewFindViewById2;
        super.onCreate(bundle);
        defpackage.cw cwVar = this.a;
        int i3 = cwVar.C;
        cwVar.b.setContentView(cwVar.B);
        android.view.Window window = cwVar.c;
        android.view.View viewFindViewById3 = window.findViewById(2131428655);
        android.view.View viewFindViewById4 = viewFindViewById3.findViewById(2131429302);
        android.view.View viewFindViewById5 = viewFindViewById3.findViewById(2131427855);
        android.view.View viewFindViewById6 = viewFindViewById3.findViewById(2131427621);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById3.findViewById(2131427914);
        android.view.View viewInflate = cwVar.g;
        if (viewInflate == null) {
            viewInflate = cwVar.h != 0 ? android.view.LayoutInflater.from(cwVar.a).inflate(cwVar.h, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (z && defpackage.cw.b(viewInflate)) {
            ((android.widget.FrameLayout) window.findViewById(2131427913)).addView(viewInflate, new android.view.ViewGroup.LayoutParams(-1, -1));
            boolean z2 = cwVar.i;
            if (cwVar.f != null) {
                viewGroup.getLayoutParams().weight = 0.0f;
            }
        } else {
            window.setFlags(131072, 131072);
            if (z) {
                ((android.widget.FrameLayout) window.findViewById(2131427913)).addView(viewInflate, new android.view.ViewGroup.LayoutParams(-1, -1));
                boolean z3 = cwVar.i;
                if (cwVar.f != null) {
                    viewGroup.getLayoutParams().weight = 0.0f;
                }
            } else {
                viewGroup.setVisibility(8);
            }
        }
        android.view.View viewFindViewById7 = viewGroup.findViewById(2131429302);
        android.view.View viewFindViewById8 = viewGroup.findViewById(2131427855);
        android.view.View viewFindViewById9 = viewGroup.findViewById(2131427621);
        android.view.ViewGroup viewGroupD = defpackage.cw.d(viewFindViewById7, viewFindViewById4);
        android.view.ViewGroup viewGroupD2 = defpackage.cw.d(viewFindViewById8, viewFindViewById5);
        android.view.ViewGroup viewGroupD3 = defpackage.cw.d(viewFindViewById9, viewFindViewById6);
        cwVar.s = (androidx.core.widget.NestedScrollView) window.findViewById(2131428874);
        cwVar.s.setFocusable(false);
        cwVar.s.setNestedScrollingEnabled(false);
        cwVar.x = (android.widget.TextView) viewGroupD2.findViewById(android.R.id.message);
        android.widget.TextView textView = cwVar.x;
        if (textView != null) {
            java.lang.CharSequence charSequence = cwVar.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                cwVar.s.removeView(cwVar.x);
                if (cwVar.f != null) {
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) cwVar.s.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(cwVar.s);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(cwVar.f, iIndexOfChild, new android.view.ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupD2.setVisibility(8);
                }
            }
        }
        cwVar.j = (android.widget.Button) viewGroupD3.findViewById(android.R.id.button1);
        android.widget.Button button = cwVar.j;
        android.view.View.OnClickListener onClickListener = cwVar.J;
        button.setOnClickListener(onClickListener);
        if (android.text.TextUtils.isEmpty(cwVar.k)) {
            cwVar.j.setVisibility(8);
            i = 0;
        } else {
            cwVar.j.setText(cwVar.k);
            cwVar.j.setVisibility(0);
            i = 1;
        }
        cwVar.m = (android.widget.Button) viewGroupD3.findViewById(android.R.id.button2);
        cwVar.m.setOnClickListener(onClickListener);
        if (android.text.TextUtils.isEmpty(cwVar.n)) {
            cwVar.m.setVisibility(8);
        } else {
            cwVar.m.setText(cwVar.n);
            cwVar.m.setVisibility(0);
            i |= 2;
        }
        cwVar.p = (android.widget.Button) viewGroupD3.findViewById(android.R.id.button3);
        cwVar.p.setOnClickListener(onClickListener);
        if (android.text.TextUtils.isEmpty(cwVar.q)) {
            cwVar.p.setVisibility(8);
        } else {
            cwVar.p.setText(cwVar.q);
            cwVar.p.setVisibility(0);
            i |= 4;
        }
        android.content.Context context = cwVar.a;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(2130968627, typedValue, true);
        if (typedValue.data == 0) {
            if (i == 0) {
                viewGroupD3.setVisibility(8);
            }
        } else if (i == 1) {
            defpackage.cw.c(cwVar.j);
        } else if (i == 2) {
            defpackage.cw.c(cwVar.m);
        } else if (i == 4) {
            defpackage.cw.c(cwVar.p);
        } else if (i == 0) {
            viewGroupD3.setVisibility(8);
        }
        if (cwVar.y != null) {
            viewGroupD.addView(cwVar.y, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131429288).setVisibility(8);
        } else {
            cwVar.v = (android.widget.ImageView) window.findViewById(android.R.id.icon);
            if (android.text.TextUtils.isEmpty(cwVar.d) || !cwVar.H) {
                window.findViewById(2131429288).setVisibility(8);
                cwVar.v.setVisibility(8);
                viewGroupD.setVisibility(8);
            } else {
                cwVar.w = (android.widget.TextView) window.findViewById(2131427444);
                cwVar.w.setText(cwVar.d);
                int i4 = cwVar.t;
                if (i4 != 0) {
                    cwVar.v.setImageResource(i4);
                } else {
                    android.graphics.drawable.Drawable drawable = cwVar.u;
                    if (drawable != null) {
                        cwVar.v.setImageDrawable(drawable);
                    } else {
                        cwVar.w.setPadding(cwVar.v.getPaddingLeft(), cwVar.v.getPaddingTop(), cwVar.v.getPaddingRight(), cwVar.v.getPaddingBottom());
                        cwVar.v.setVisibility(8);
                    }
                }
            }
        }
        boolean z4 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        int i5 = (viewGroupD == null || viewGroupD.getVisibility() == 8) ? 0 : 1;
        boolean z5 = (viewGroupD3 == null || viewGroupD3.getVisibility() == 8) ? false : true;
        if (!z5 && viewGroupD2 != null && (viewFindViewById2 = viewGroupD2.findViewById(2131429243)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (i5 != 0) {
            androidx.core.widget.NestedScrollView nestedScrollView = cwVar.s;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            android.view.View viewFindViewById10 = (cwVar.e == null && cwVar.f == null) ? null : viewGroupD.findViewById(2131429286);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupD2 != null && (viewFindViewById = viewGroupD2.findViewById(2131429244)) != null) {
            viewFindViewById.setVisibility(0);
        }
        android.widget.ListView listView = cwVar.f;
        if (listView instanceof android.support.v7.app.AlertController$RecycleListView) {
            if (!z5) {
                i2 = i5;
            } else if (i5 == 0) {
                i2 = 0;
            }
            android.support.v7.app.AlertController$RecycleListView alertController$RecycleListView = (android.support.v7.app.AlertController$RecycleListView) listView;
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z5 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z4) {
            android.view.View view = cwVar.f;
            if (view == null) {
                view = cwVar.s;
            }
            if (view != null) {
                int i6 = true == z5 ? 2 : 0;
                android.view.View viewFindViewById11 = window.findViewById(2131428873);
                android.view.View viewFindViewById12 = window.findViewById(2131428872);
                int i7 = dzs.a;
                view.setScrollIndicators(i5 | i6, 3);
                if (viewFindViewById11 != null) {
                    viewGroupD2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupD2.removeView(viewFindViewById12);
                }
            }
        }
        android.widget.ListView listView2 = cwVar.f;
        if (listView2 == null || (listAdapter = cwVar.z) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i8 = cwVar.A;
        if (i8 >= 0) {
            listView2.setItemChecked(i8, true);
            listView2.setSelection(i8);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.a.s;
        if (nestedScrollView == null || !nestedScrollView.n(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.a.s;
        if (nestedScrollView == null || !nestedScrollView.n(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.ds, android.app.Dialog
    public final void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }
}
