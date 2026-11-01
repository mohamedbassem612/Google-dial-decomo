package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ys {
    public java.util.List a = new java.util.ArrayList();
    public final java.util.List b = new java.util.ArrayList();
    public androidx.car.app.model.Header c = null;
    public final androidx.car.app.model.SearchHeader d = null;
    public boolean e = false;
    public boolean f = false;
    public final int g = 0;
    public final int h = 1;

    public final androidx.car.app.model.SectionedItemTemplate a() {
        if (this.e && !this.a.isEmpty()) {
            throw new java.lang.IllegalArgumentException("A template cannot both be in a loading state and have sections added");
        }
        boolean z = false;
        for (int i = 0; i < this.a.size(); i++) {
            androidx.car.app.model.Section section = (androidx.car.app.model.Section) this.a.get(i);
            if (section instanceof androidx.car.app.model.ChipSection) {
                if (z) {
                    throw new java.lang.IllegalArgumentException("Only one ChipSection is allowed in SectionedItemTemplate.");
                }
                if (i != 0) {
                    throw new java.lang.IllegalArgumentException("ChipSection must be the first section in SectionedItemTemplate.");
                }
                z = true;
            } else if (!(section instanceof androidx.car.app.model.RowSection) && !(section instanceof androidx.car.app.model.GridSection) && !(section instanceof androidx.car.app.model.CondensedSection) && !(section instanceof androidx.car.app.model.SpotlightSection) && !(section instanceof androidx.car.app.model.BannerSection)) {
                throw new java.lang.IllegalArgumentException("Only ChipSections, RowSections, GridSections, CondensedSections, SpotlightSections, and BannerSections are allowed in SectionedItemTemplate.");
            }
        }
        return new androidx.car.app.model.SectionedItemTemplate(this, null);
    }

    public final void b() {
        this.e = true;
    }
}
