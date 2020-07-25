package tfm.arcs.sdg;

import org.jgrapht.io.Attribute;
import org.jgrapht.io.DefaultAttribute;

import java.util.Map;

/**
 * An interprocedural arc that connects a call site with its
 * corresponding declaration. It is considered an interprocedural input.
 */
public class CallArc extends InterproceduralArc {
    @Override
    public Map<String, Attribute> getDotAttributes() {
        Map<String, Attribute> map = super.getDotAttributes();
        map.put("style", DefaultAttribute.createAttribute("dashed"));
        return map;
    }

    @Override
    public boolean isInterproceduralInputArc() {
        return true;
    }

    @Override
    public boolean isInterproceduralOutputArc() {
        return false;
    }
}
