package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gmo extends dye {
    final /* synthetic */ androidx.viewpager.widget.ViewPager a;

    public gmo(androidx.viewpager.widget.ViewPager viewPager) {
        this.a = viewPager;
    }

    private final boolean j() {
        defpackage.gmi gmiVar = this.a.c;
        return gmiVar != null && gmiVar.i() > 1;
    }

    public final void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        androidx.viewpager.widget.ViewPager viewPager;
        defpackage.gmi gmiVar;
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(j());
        if (accessibilityEvent.getEventType() != 4096 || (gmiVar = (viewPager = this.a).c) == null) {
            return;
        }
        accessibilityEvent.setItemCount(gmiVar.i());
        accessibilityEvent.setFromIndex(viewPager.d);
        accessibilityEvent.setToIndex(viewPager.d);
    }

    public final void c(android.view.View view, defpackage.ebd ebdVar) {
        super.c(view, ebdVar);
        ebdVar.s("androidx.viewpager.widget.ViewPager");
        ebdVar.N(j());
        androidx.viewpager.widget.ViewPager viewPager = this.a;
        if (viewPager.canScrollHorizontally(1)) {
            ebdVar.h(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            ebdVar.h(8192);
        }
    }

    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (i == 4096) {
            androidx.viewpager.widget.ViewPager viewPager = this.a;
            if (viewPager.canScrollHorizontally(1)) {
                viewPager.m(viewPager.d + 1);
                return true;
            }
        } else if (i == 8192) {
            androidx.viewpager.widget.ViewPager viewPager2 = this.a;
            if (viewPager2.canScrollHorizontally(-1)) {
                viewPager2.m(viewPager2.d - 1);
                return true;
            }
        }
        return false;
    }
}
